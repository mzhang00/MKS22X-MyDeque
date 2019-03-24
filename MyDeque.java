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
    if (end >= start){
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

  @SuppressWarnings("unchecked")
  private void resize(){
    E[] newdata = (E[])new Object[data.length * 2 + 1];
    int counter = 0;
    if (end >= start){
      for (int i = start; i <= end; i++){
        newdata[counter] = data[i];
        counter++;
      }
    }else{
      for (int i = start; i < data.length; i++){
        newdata[counter] = data[i];
        counter++;
      }
      for (int i = 0; i <= end; i++){
        newdata[counter] = data[i];
        counter++;
      }
    }
    data = newdata;
  }

  public void addFirst(E element){
    if (element == null){
      throw new NullPointerException();
    }
    if (end >= start){
      if (end - start + 1 == data.length){
        resize();
      }
      if (start == 0){
        start = data.length - 1;
      }else{
        start--;
      }
      data[start] = element;
    }else{    
      if (data.length == data.length - start + end + 1){
        resize();
      }
      if (start == 0){
        start = data.length - 1;
      }else{
        start--;
      }
      data[start] = element;
    }
  }

  public void addLast(E element){
    if (element == null){
      throw new NullPointerException();
    }
    if (end >= start){
      if (end - start + 1 == data.length){
        resize();
      }
      if (end == data.length - 1){
        end = 0;
      }else{
        end++;
      }
      data[end] = element;
    }else{    
      if (data.length == data.length - start + end + 1){
        resize();
      }
      if (end == data.length - 1){
        end = 0;
      }else{
        end++;
      }
      data[end] = element;
    }
  }

  public E removeFirst(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    E value = data[start];
    if (start != data.length - 1){
      start++;
    }else{
      start = 0;
    }
    size--;
    return value;
  }

  public E removeLast(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    E value = data[end];
    if (end != 0){
      end--;
    }else{
      end = data.length - 1;
    }
    size--;
    return value;
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
