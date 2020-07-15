package linkedlists;

import java.util.HashSet;

public class MyLinkedList<E> {
    public int sizel = 0;
    Node<E> head;
    /*

        Remove a middle Node of Linked List

     */
    public void removeMiddleNode(){
        Node<E> temp = head;
        if(sizel%2 ==0){
            int index = sizel/2;
            for(int i=0;i<index-1;i++){
                temp  = temp.next;
            }
        }
        else {

        }
    }


    /*

    remove a Node from the Kth Last Index
     */
    public void RemoveKthLastIndex(int index){

        Node<E> temp = head;
        if(isEmpty())
            return;
        if(index == 1)
            deleteNodeLast();
        for(int i=0;i<(sizel-index-1-1) && temp != null; i++){
            temp = temp.next;
        }
        if(temp == null|| temp.next == null)
            return;
        temp.next = temp.next.next;
    }



    /*
    Remove Duplicate from the LinkedList
     */
    public void deleteDuplicates(){
        Node<E> temp = head;
        Node<E> prev = null;
        HashSet<E> set = new HashSet<>();
        while(temp != null){
            if(set.contains(temp.data)){
                prev.next = temp.next;
                sizel--;
            }
            else{
                set.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }

    }




    /*
    Delete Node at specific index

     */

    public void deleteIndex(int index){
        Node<E> temp =  head;
        if(head == null)
            return;
        if(index == 0) {
            head = temp.next;
            return;
        }
        for(int i=0;i<index-1 && temp != null ;i++) {
            temp = temp.next;
        }
        if(temp == null || temp.next == null)
            return;
        temp.next = temp.next.next;

    }


    /*
    deleting the node from the last

     */

    public void deleteNodeLast(){
        Node<E> temp = head;
        Node<E> U = null ;
        while(temp.next != null) {
            U = temp;
            temp = temp.next;
        }
        assert U != null;
        U.next = null;
        sizel--;

    }




    /*
    deleting the node from the beginning

     */
    public void deleteFirstNode(){
        if(isEmpty()){
            System.out.println("Empty list");
        }
        Node<E> temp = head;
        temp = temp.next;
        head = temp;
        sizel--;

    }

    /*  set Node at specific position
        for adding the node at specific place


     */
    public void insertAt(int index, E data){
        if(isEmpty()){
            System.out.println("List is empty");
        }
        if(index == sizel){
            addLast(data);
        }
        if(index == 0)
            addFirst(data);


        Node<E> newNode = new Node<>(data);
        Node<E> temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        sizel++;

    }

    /*  set Node at First  position
    for adding the node at Firs Place
 */



    public void addFirst(E data){
        Node<E> addfirst = new Node<>(data);
        if(isEmpty()){
            head = addfirst;
            sizel++;
            return;
        }
        addfirst.next = head;
        head = addfirst;
        sizel++;
    }
    /*  set Node at Last  position
    for adding the node at Last Place
 */
    public void addLast(E data){
        Node<E> toadd = new Node<>(data);
        if(isEmpty()){
            head = toadd;
            sizel++;
            return;
        }
        Node<E> temp =head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toadd;
        sizel++;
    }
    //    Display the linked list
    public void display(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    //  check the List is Empty or not
    boolean isEmpty(){
        return head == null;
    }

    /*  creating a new node b using static class
     */
    static class Node<E>{
        private final E data;
        private Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}
