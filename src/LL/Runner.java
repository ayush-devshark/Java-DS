package LL;

public class Runner {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.insert(4);
    ll.insert(7);
    ll.insert(5);
    ll.insertFront(3);
    ll.insertAfter(7, 6);
    ll.delete(3);
    ll.show();
  }
}
