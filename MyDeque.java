public class MyDeque<E>{
  private static E[] data;
  private static int size, start, end;

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
//need to FIX
    }else{
      //
    }
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

/*
  public static void main(String[] args) {
    data = new int[4];
    data[0] = 1;
    data[1] = 2;
    data[2] = 3;
    data[3] = 4;
    start = 0;
    end = 3;
    System.out.println(this.toString());
  }
*/

}
