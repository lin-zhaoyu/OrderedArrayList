import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {


  private int helper(T value){
    int index = 0;
    for(int i = 0; i < this.size(); i ++){
      if(value.compareTo(this.get(i)) < 0){
        index = i;
        return index;
      }
    }
    return this.size();
  }

  public boolean add(T element) {
  int ind = helper(element);
  super.add(ind,element);
  return true;
}

  


}
