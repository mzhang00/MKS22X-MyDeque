import java.util.*;

public class Driver2{
    public static void main(String[] args){
        MyDeque<Integer> my = new MyDeque<>();
        System.out.println(my);
        my.addFirst(Integer.valueOf(2));
        System.out.println(my.toString());
    }
}