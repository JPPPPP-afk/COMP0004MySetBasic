package uk.ac.ucl;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * This class implements methods common to all concrete set implementations but does not
 * represent a complete set implementation.<br />
 *
 * New set objects are created using a MySetFactory.
 */

public abstract class AbstractMySet<T extends Comparable<T>> implements MySet<T>
{
  @Override
  public boolean equals(MySet<T> aSet)
  {
    // TODO write a working method body.
    List<T> arrayA = this.toList();
    List<T> arrayB = aSet.toList();
    if( arrayA.size()>0 && (arrayB.size()==arrayA.size()))
    {
      int bool = 1;
      for (int a = 0; a<arrayA.size();a++){
        for(int b = a;;){
          if(a!=b){
            bool=0;
            break;
          }
          else{
            break;
          }
        }
      }
      if(bool==1)
      {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode()
  {
    return toList().hashCode();
  }

  public ArrayList<T> toList()
  {
    // TODO write the code to return a List of the set contents.
    Iterator iter = this.iterator();
    ArrayList<T> list = new ArrayList<T>();
    while(iter.hasNext()){
      list.add((T) iter.next());
    }
    return list;
  }

  public MySet<T> union(MySet<T> mySet) throws MySetException
  {
    MySet<T> result = MySetFactory.getInstance().getMySet();

    //TODO write the statements needed to find the union

    return result;
  }

  public MySet<T> intersection(MySet<T> mySet) throws MySetException
  {
    MySet<T> result = MySetFactory.getInstance().getMySet();

    // TODO write the statements needed to find the intersection.

    return result;
  }

  public MySet<T> difference(MySet<T> mySet) throws MySetException
  {
    MySet<T> result = MySetFactory.getInstance().getMySet();

    // TODO write the statements needed to find the difference.
    return result;
  }

  protected void checkSize(int maximumSize)
    throws MySetException
  {
     // TODO throw an exception if the set exceeds its maximum size.
  }

  // A helper method that might be useful.
  private void addAll(MySet<T> source, MySet<T> destination)
    throws MySetException
  {
    for (T value : source)
    {
      destination.add(value);
    }
  }
}
