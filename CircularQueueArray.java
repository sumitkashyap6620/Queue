
import java.util.LinkedList;
import java.util.Queue;

class QueC{
    int arr [] = new int[7];
    int front = -1 ;
    int rare = -1 ;
    int size = 0 ;
    void Add(int val)throws Exception{
       if(size == arr.length){
        throw new Exception("Que is full now !");
       }
        else if( front == -1){
            front++ ;
            size++ ;
            arr[++rare] = val ;
           }
           else if(rare != arr.length-1 ){
             size++ ;
            arr[++rare] = val ;
           }
           else{
            rare = 0 ;
            arr[rare] = val ;
            size ++ ;
           }
    }

    int Remove() throws Exception{
     if(size == 0)throw new Exception("Empty Queue !");
     else if (front <= rare && front !=arr.length-1){
        int t = front ;
        front++ ;
        size-- ;
        return arr[t];
     }
     else if(front == arr.length-1){
       int t = front ;
        front = 0 ;
        size-- ;
        return arr[t];
     }
      else{
       int t = front ;
        front++ ;
        size-- ;
        return arr[t];
      }
    }
    int peak() throws Exception{
        if(size == 0)throw new Exception("Queue is empty !");
        else return arr[front];
     }
     void Display()throws Exception{
      int temp = front ;
      if(size == 0)throw new Exception("can't display its empty");
      else if (temp <= rare) {
          while(temp<=rare){
            System.out.print(arr[temp]+" ");
            temp++ ;
          }
          System.out.println("");
      }
      else{
        while(temp>=rare ){
          if(temp == arr.length){
            temp = 0 ;
            while(temp<=rare){
              System.out.print( arr[temp]+" ");
              temp++ ;
             }
             System.out.print("");
            break;
          }
         System.out.print(arr[temp]+" ");
         temp++ ;
        }
         System.out.print("");
      }
     }
}

public class CircularQueueArray{
    public static void main(String args[])throws Exception{
      Queue q = new LinkedList();
     QueC q1 = new QueC();
     q1.Add(10);
     q1.Add(9);
     q1.Add(8);
     q1.Add(7);
     q1.Add(6);
     q1.Add(5);
     q1.Add(4);
     q1.Display();
     q1.Remove();
     q1.Remove();
     q1.Remove();
     q1.Remove();
     q1.Remove();
     q1.Remove();
     q1.Remove();
     q1.Add(100);
     q1.Add(200);
     q1.Add(300);
     q1.Add(400);
     q1.Add(500);
     q1.Add(600);
     q1.Add(700);
     q1.Remove();
     q1.Remove();
     System.out.println(q1.peak());
     q1.Display();
    }
}