public class SinglyLinkedList {

  public Node head;


  // Initialize list
  public SinglyLinkedList() {
    this.head = null;
  }


  // Add a node to the list
  public void add(int value) {

    Node newNode = new Node(value);

    if(head == null) {
      head = newNode;
    } else {
      Node runner = head;

      while (runner.next != null) {
        runner = runner.next;
      }

      runner.next = newNode;
    }
  }    


  // Will remove a node from the end of your list
  public void removeLast() {
    if (head != null) {
      Node runner = head;
      
      while (runner.next.next != null) runner = runner.next;

      runner.next = null;
    }
  }


  // Will print all the values of each node in the list in order
  public void printValues() {
    Node runner = this.head;

    if (runner == null) {
      System.out.println(runner);
    } else {
      while(runner != null) {
        System.out.println(runner.value);
        runner = runner.next;
      }
    }
  }


  // Will return the first node with the value in the parameter
  public Node find(int value) {
    Node runner = this.head;

    while(runner.value != value) {
      runner = runner.next;
    }

    return runner;
  }


  // Will remove the node after n nodes, where n is the parameter
  public void removeAt(int n) {
    Node runner = this.head;

    if (runner == null) {
      System.out.println("List is empty.");
    } else if (n == 0) {
      this.head = runner.next;
    } else {
      for (int i = 0; i < n-1; i++) {
        runner = runner.next;
      }

      runner.next = runner.next.next;
    }
  }
}
