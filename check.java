class A {
void show(){
    System.out.println("this is A ");
}
}
class B extends A{
void show(int a ){
    System.out.println("this is B ");
}
}
public class check{
    public static void main (String args[]){
       A obj1 = new A() ;
       B obj2 = new B() ;
       obj1.show();
       obj2.show(5);
       obj2.show();
    }
} 