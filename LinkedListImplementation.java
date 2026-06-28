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

}
public class LinkedListImplementation{

}
