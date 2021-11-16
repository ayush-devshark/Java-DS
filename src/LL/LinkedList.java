package LL;

public class LinkedList {
  Node head;
  public void insert(int n ){
    // First create a node
      Node new_node = new Node();

      new_node.data = n;

      if(head == null){
        // Head pointing to new_node
        head = new_node;
      }else{
        // temp pointing to head
        Node temp = head;
        while(temp.next != null){
          temp = temp.next;
        }
        //  temp is pointing to last node
        temp.next = new_node;
      }
      return;
  }
}
