package LL;

public class LinkedList {
  Node head;
  public void insert(int n ){
    // First create a node
      Node new_node = new Node();

      new_node.data = n;

      // When head is null, there are no nodes in Linked List
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

  public void show (){
    Node temp = head;
    while(temp != null){
       System.out.print(temp.data +" ");
       temp = temp.next;
    }
    return;
  }

  public void insertFront(int n){
    Node new_node = new Node();
    new_node.data = n;
    new_node.next = head;
    head = new_node; 
    return;
  }

  public void insertAfter(int b, int n){
//   b =  node before 'n'
       Node new_node = new Node();
       new_node.data = n;
       Node temp = head;
       while(temp.data != b){
         temp = temp.next;
       }
      //  temp poiniting to node 'b' after which 'n' is to be inserted
      new_node.next = temp.next;
      temp.next = new_node;
      return;
  }

  public void delete(int n){
    if(head == null){
      return;
    }
    if( head.data == n){
      // if first node to be deleted
      head = head.next;
    } else{
      Node curr = head;
      Node prev = null;
      while(curr.data != n){
          prev = curr;
          curr = curr.next;
      }
      // curr reference to Node to be deleted
      // prev reference to prev Node 
      prev.next = curr.next;
      return;
    }
  }
}
