import java.util.NoSuchElementException;
import java.lang.NullPointerException;

public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    size = 0;
    start = 0;
    end = 0;
  }

  public int size(){
    return size;
  }

  public String toString(){
    String ans = "{";
    if (end > start){
      for (int i = start; i <= end; i++){
        ans = ans + "" + data[i].toString() + " ";
      }
    }else{
      for (int i = start; i < data.length; i++){
        ans = ans + "" + data[i].toString() + " ";
      }
      for (int i = 0; i <= end; i++){
        ans = ans + "" + data[i].toString() + " ";
      }
    }
    return ans.substring(0, ans.length() - 1) + "}";
  }

  private void resize(){
    
  }

  public void addFirst(E element){
    return;
  }
  public void addLast(E element){
    return;
  }
  public E removeFirst(E element){
    if (size == 0){
      throw new NoSuchElementException();
    }
    return element;
  }
  public E removeLast(E element){
    if (size == 0){
      throw new NoSuchElementException();
    }
    return element;
  }

  public E getFirst(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    return data[start];
  }

  public E getLast(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    return data[end];
  }
}
