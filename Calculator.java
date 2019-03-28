import java.util.*;
import java.io.*;

public class Calculator{
  public static double eval(String s){
    String operations = "+-*/%";
    MyDeque<Integer> deq = new MyDeque<>();
    String[] values = s.split(" ", 0);
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
    return deq.getFirst();    
  }
}
