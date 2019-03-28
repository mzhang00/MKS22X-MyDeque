import java.util.*;
import java.io.*;

public class Calculator{
  public static double eval(String s){
    String operations = "+-*/%";
    MyDeque<Integer> deq = new MyDeque<>();
    String[] values = s.split(" ", -2);
    for (int i = 0; i < values.length; i++){
      if (operations.contains(values[i])){
        if (values[i].equals("+")){  
          deq.addFirst(deq.removeFirst() + deq.removeFirst());
        }
        if (values[i].equals("-")){  
          deq.addFirst(deq.removeFirst() - deq.removeFirst());
        }
        if (values[i].equals("*")){  
          deq.addFirst(deq.removeFirst() * deq.removeFirst());
        }
        if (values[i].equals("/")){  
          deq.addFirst(deq.removeFirst() / deq.removeFirst());
        }
        deq.addFirst(deq.removeFirst() % deq.removeFirst());
      }else{
        deq.addFirst(Integer.parseInt(values[i]));
      }
    }
    if (deq.size() == 1){
      return deq.getFirst();
    }else{
      return -1;
    }
  }
}
