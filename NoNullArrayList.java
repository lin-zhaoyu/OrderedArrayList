import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{

  public void add(int index, T element){
    try{
      if(element==null){
        throw new IllegalArgumentException("Your element is null");
      }
      super.add(index,element);
    }catch(IllegalArgumentException e){
      throw new IllegalArgumentException("Your element is null");
    }
  }

  public boolean add(T element){
    if (element == null) {
      throw new IllegalArgumentException("Your element is null");
    }
    super.add(element);
    return true;
  }
  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Your element is null");
    }
    T temp = super.get(index);
    super.add(index,element);
    super.remove(temp);
    return temp;
  }

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(T startingCapacity) {
    super();
    if (startingCapacity == null) {
        throw new IllegalArgumentException("The initial capacity cannot be null");
    }
  }

}
