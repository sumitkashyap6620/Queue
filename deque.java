
import java.util.Deque;
import java.util.LinkedList;


public class deque{
public static void main(String args[]){
    Deque<Integer> dq = new LinkedList();
    dq.add(15);
    dq.add(10);
    dq.add(5);
    dq.add(0);
    dq.add(-5);
    System.out.println(dq);
    dq.addLast(23);
    dq.addFirst(-23);
     System.out.println(dq);
     dq.removeFirst();
     dq.removeLast();
     System.out.println(dq);
     
     
      System.out.println(dq.getFirst());
      System.out.println(dq.getLast());
}
}