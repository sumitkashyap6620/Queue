class node {
    int val ;
    node next ;
    node(int val){
        this.val = val ;
    }
}
class QueL{
// Add ,remove ,size ,peek
node front ;
node rare ;
int size = 0;
void Add(int val ){
    if(size == 0){
        node temp1 = new node (val) ; 
        front = temp1 ;
        rare = temp1 ;
        size++;
    }
    else{
        node temp = new node(val);
        rare.next = temp ; 
        rare = temp ;
        size++ ;
    }

}
int Remove(){
    if(size == 0){
        System.out.println("Queue is empyty can not remove element");
        return -1 ;
    }
    else {
        int r = front.val ;
        front =  front.next ;
        size-- ;
        return r ;
    }
}
int Size(){
    return size ; 
}

int peek(){
       if(size == 0){
        System.out.println("Queue is empyty not having  element");
        return -1 ;
    }
    else{
        return front.val ;
    }
}

void Display(){
    if(size ==0){
     System.out.println("empty que");
    }
   else{ node t = front ;
    while (t != null){
        System.out.print(t.val+" ");
        t=t.next ;
    }
   System.out.println("");
}}

}
public class LinkedListImplementation{
    public static void main(String[] args) {
        
  
 QueL obj = new QueL();

 obj.Add(15);
   obj.Display();
 obj.Remove();
//  obj.Remove();
  obj.Add(15);
  obj.Add(20);
  obj.Add(25);
  obj.Add(15);
   obj.Display();
}
}