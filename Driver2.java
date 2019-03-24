import java.util.*;

public class Driver2{
    public static void main(String[] args){
        MyDeque<Integer> my = new MyDeque<>();
        System.out.println(my);
        Integer two = Integer.valueOf(2);
//        System.out.println(two);
  //      System.out.println(two == null);
        my.addFirst(two);
        System.out.println(my.toString());
    }
}