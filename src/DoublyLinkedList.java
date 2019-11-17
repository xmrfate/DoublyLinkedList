public class DoublyLinkedList {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        boolean delete_result = false;

        list.insert(7);
        list.insert(10);
        list.insert(30);
        list.insert(44);
        list.insert(55);

        System.out.println("Inorder print: ");
        list.print();

        System.out.println("\n\nReverse print: ");
        list.print_reverse();

        //deleting a head node
        delete_result = list.delete(7);
        System.out.println();
        System.out.println();
        list.print();
        System.out.println();
        list.print_reverse();

        if(delete_result){
            System.out.println("Target 7 has been deleted.");
        } else{
            System.out.println("Target was not deleted.");
        }

        //deleting a tail node
        delete_result = false;
        delete_result = list.delete(55);
        System.out.println();
        System.out.println();
        list.print();
        System.out.println();
        list.print_reverse();

        if(delete_result){
            System.out.println("Target 55 has been deleted.");
        } else{
            System.out.println("Target was not deleted.");
        }

        //deleting a middle node
        delete_result = false;
        delete_result = list.delete(30);
        System.out.println();
        System.out.println();
        list.print();
        System.out.println();
        list.print_reverse();

        if(delete_result){
            System.out.println("Target 30 has been deleted.");
        } else{
            System.out.println("Target was not deleted.");
        }

        //node that fails to exist
        delete_result = false;
        delete_result = list.delete(88);

        if(delete_result){
            System.out.println("Target 88 has been deleted.");
        } else{
            System.out.println("Target was not deleted.");
        }
    }

}
