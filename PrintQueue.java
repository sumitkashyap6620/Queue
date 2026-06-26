import java.util.*;
public class PrintQueue{
    public static void main(String[] args) {
        Queue <Integer> Qu = new LinkedList<>();
        Qu.add(15);
        Qu.add(10);
        Qu.add(25);
        Qu.add(205);
        System.out.println(Qu);
        while(Qu.size() !=0){
            System.out.println(Qu.element());
            Qu.remove();
        }
    }
}