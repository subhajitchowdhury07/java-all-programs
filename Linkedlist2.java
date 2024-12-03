import java.util.*;

public class Linkedlist2 {
  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<String>();
    
    ll.addFirst("a");
    ll.addLast("is");
    ll.addFirst("this");
    ll.addLast("list");
  System.out.println(ll);
  System.out.println(ll.size());

  for(int i=0;i<ll.size() ; i++){
    System.out.print(ll.get(i)+ " -> ");
  }
  System.out.println("null");
  // ll.removeFirst();
  // ll.remove(); // it remove first element 
  // ll.removeLast();
 ll.remove(2);  // remove value using index;
  System.out.println(ll);



  }

  
  
}
