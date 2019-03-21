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
    String ans = "{";/*
    if (data.length - start < size){

    }
    for (int i = start; i < )*/
    return ans + "}";
  }

  public void addFirst(E element){
    return;
  }
  public void addLast(E element){
    return;
  }
  public E removeFirst(E element){
    return element;
  }
  public E removeLast(E element){
    return element;
  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }
}
