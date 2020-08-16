//import java.util.Scanner;
import java.util.LinkedList;
class Linked_List<E>{
    public int count = 0;
    Node<E> head;
//    set Node at specific position
    public void set(E data, int pos){
        if (isEmpty()){
            System.out.println("List is empty");
        }
        if(pos==1)
            addFirst(data);
        if(pos==count)
            addLast(data);
        Node<E> setdata = new Node<>(data);
        Node<E> temp = head;
        Node<E> prev;
        while(pos-- != 0){
            temp = temp.next;
        }
        



    }
//    add Node the First place
    public void addFirst(E data){
        Node<E> addfirst = new Node<>(data);
        if(isEmpty()){
            head = addfirst;
            count++;
            return;
        }
        addfirst.next = head;
        head = addfirst;
        count++;

    }
//add Node at the last
    public void addLast(E data){
        Node<E> toadd = new Node<>(data);
        if(isEmpty()){
            head = toadd;
            count++;
            return;
        }
        Node<E> temp =head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toadd;
        count++;

    }
//    Display the linked list
    void display(){
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

// Creation of Node
    static class Node<E>{
        private E data;
        private Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
}

//Main class
public class MyLinkedList {
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter any number");
//       E num = sc.nextInt();
       Linked_List<Integer> ll = new Linked_List<>();
       ll.addFirst(5);
        ll.addFirst(10);
        for(int i=0;i<10;i++){
            ll.addFirst(i*10);
        }
       ll.display();
       System.out.println("\n"+ll.count);
       LinkedList<Integer> ll = new LinkedList<>();
       
    }
}
