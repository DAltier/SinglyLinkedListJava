public class ListTester {

  public static void main(String[] args) {

    // Create new list
    SinglyLinkedList sll = new SinglyLinkedList();


    // Add nodes to list and print the list
    System.out.println(" ------- Add nodes to list and print the list ------- ");
    sll.add(3);
    sll.add(4);
    sll.add(10);
    sll.add(5);
    sll.add(15);
    sll.add(4);
    sll.add(2);
    sll.printValues();
    System.out.println();


    // Remove the last node and print the list
    System.out.println(" ------- Remove the last node and print the list ------- ");
    sll.removeLast();
    sll.printValues();
    System.out.println();


    // Remove the node at a specific position and print the list
    System.out.println(" ------- Remove the node at a specific position and print the list ------- ");
    sll.removeAt(3);
    sll.printValues();
    System.out.println();


    // Find the first node with the given value
    System.out.println(" ------- Find the first node with the given value ------- ");
    System.out.println(sll.find(4).next.value);
  }
}
