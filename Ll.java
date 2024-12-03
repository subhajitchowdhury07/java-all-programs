

public class Ll {

    static void removeFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    Node head;
    class Node{
      String data;
      Node next;
    

      Node(String data){
      this.data = data;
      this.next= null;
    }
  }
    // add frist funcation
    public void addFirst(String data){
      Node newNode = new Node(data);
      if(head == null){
        head = newNode;
        return;
      }

      newNode.next = head;
      head= newNode;
    }

    // add last funcation

    public void addLast(String data){
      Node newNode = new Node(data);
      if(head == null){
        head = newNode;
        return;
      }

      Node currNode = head;
      while(currNode.next != null){
        currNode = currNode.next;
      }

      currNode.next = newNode;
    }

    // for print linkedlist

    public void printList(){

      if(head == null){
        System.out.println("empty linkedlist");
        return;
      }
      Node currNode = head;
      while(currNode != null){
        System.out.print(currNode.data + " -> ");
        currNode = currNode.next;
      }

      System.out.print("Null");
    }

    // Delete first 

    public void deleteFirst(){
      if(head == null){
        System.out.println("empty");
        return;
      }

      head = head.next;
    }

    // delete last

    public void deleteLast(){
      if(head == null){
        System.out.println("empty");
        return;
      }
      if(head.next == null){
        head = null;
        return;
      }
      Node secLast = head;
      Node last = head.next;

      while(last.next != null){
        last = last.next;
        secLast = secLast.next;
      }
      secLast.next =null;
    }

    public static void main(String[] args) {
      Ll list = new Ll();
      list.addFirst("a");
      list.addFirst("B");
      // list.printList();

      list.addLast("is a");
      list.addLast("list");

      list.addFirst("this");
      
      list.deleteFirst();
      list.deleteLast();
      list.printList();
    }
}
