import linkedlists.MyLinkedList;


public class My_Linked_List {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();
        mll.addFirst(3);
        mll.addFirst(2);
        mll.addFirst(1);
        mll.addLast(4);
        mll.addLast(5);
        mll.addLast(6);
        System.out.println("before");
        mll.display();

        mll.insertAt(2,100);
        mll.insertAt(4,45);
        mll.insertAt(5,4);
        mll.insertAt(5,4);
        mll.insertAt(5,4);
        mll.insertAt(5,4);
        mll.insertAt(5,4);
        System.out.println("after");
        mll.display();


        mll.deleteFirstNode();

        System.out.println("after");
        mll.display();

        mll.deleteNodeLast();
        System.out.println("after");
        mll.display();
        System.out.println("\n"+mll.sizel);

//        mll.deleteIndex(1);
//        mll.display();


        mll.deleteDuplicates();
        mll.display();
        System.out.println("\n"+mll.sizel);

        mll.RemoveKthLastIndex(3);
        mll.display();

    }

}
