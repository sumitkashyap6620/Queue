class QueC{
    int arr [] = new int[10];
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
     else if (front <= rare && front < arr.length){
        int t = front ;
        front++ ;
        size-- ;
        return arr[t];
     }
      else{
        int t = front ;
        front = 0 ;
        size-- ;
        return arr[t];
      }
    }
    int peak() throws Exception{
        if(size == 0)throw new Exception("Queue is empty !");
        else return arr[front];
     }
     void Display(){
        
     }
}

public class CircularQueueArray{
    public static void main(String args[]){
     QueC q1 = new QueC();
    }
}