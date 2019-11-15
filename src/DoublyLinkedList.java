public class DoublyLinkedList {

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insert(7);
        list.insert(10);
        list.insert(30);
        list.insert(44);
        list.insert(55);

        System.out.println("Inorder print: ");
        list.print();

        System.out.println("\n\nReverse print: ");
        list.print_reverse();
    }

}
