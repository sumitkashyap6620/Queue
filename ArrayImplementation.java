// add , remove , size ,peek , display 
class Que{
    int arr[] = new int[4];
    int f = -1 ;
    int r = -1 ;
    int size = 0 ;
    void add(int a){
        if(f == -1){
            f++ ;
            r++;
            size++ ;
          arr[0] = a ; 
        }
        else if (r != arr.length-1){
            r++ ;
            arr[r] = a ;
            size ++ ;
        }
        else System.out.println("Can not add more because Queue if full !!!");
    }
    int remove(){
        if(size == 0){
            System.out.println("Can not remove from Empty Queue !!!");
            return -1 ;
        }
        else {
            f++ ;
            size-- ;
            return arr[f-1];
        }
    }
    int size(){
        return size ;
    }
    int peak(){
        if(size != 0 ) return arr[f];
        else{
            System.out.println("Queue is empty !!!");
            return -1 ;
        }
    }
    void display(){
        if(size == 0)System.out.println("Queue is Empty !!!");
        else{
            int temp1 = f ;
            int temp2 = r ;
            while(temp1 <= temp2 ){
                System.out.print(arr[temp1]+" ");
                temp1++ ;
            }
            System.out.println();
        }
    }

}
public class ArrayImplementation{
   public static void main(String[] args) {
        Que q = new Que();
        
        q.add(5);
          q.display();
        q.remove();
        q.remove();
          q.display();
         q.add(12);
         q.add(50);
         q.add(35);
         q.add(25);
         q.add(235);
          q.remove();
          q.remove();
          q.remove();
          q.remove();
         q.display();
   }
}