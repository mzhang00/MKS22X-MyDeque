import java.util.*;
import java.io.*;

public class Calculator{
  public static double eval(String s){
    String operations = "+-*/%";
    MyDeque<Double> deq = new MyDeque<>();
    double temp = 0.0;
    String[] values = s.split(" ", 0);
    for (int i = 0; i < values.length; i++){
      if (operations.contains(values[i])){
        if (values[i].equals("+")){  
          temp = deq.removeFirst();
          deq.addFirst(deq.removeFirst() + temp);
        }
        if (values[i].equals("-")){
          temp = deq.removeFirst();  
          deq.addFirst(deq.removeFirst() - temp);
        }
        if (values[i].equals("*")){
          temp = deq.removeFirst();  
          deq.addFirst(deq.removeFirst() * temp);
        }
        if (values[i].equals("/")){
          temp = deq.removeFirst();  
          deq.addFirst(deq.removeFirst() / temp);
        }
        if (values[i].equals("%")){
          temp = deq.removeFirst();  
          deq.addFirst(deq.removeFirst() % temp);
        }
      }else{
        deq.addFirst(Double.parseDouble(values[i]));
      }
    }
    return deq.getFirst();    
  }
  public static void main(String[] args){
    System.out.println("+-*/%".contains("1.0"));
  }
}
