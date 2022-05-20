package may16;

import java.util.LinkedList;
import java.util.List;

public class Driver {
  public static void main(String[] args) {

    List<Integer> a = new LinkedList<>();
    a.add(8);
    a.add(1);
    a.add(2);

    List<Integer> b = new LinkedList<>();
    b.add(1);
    b.add(1);
    b.add(1);

    SumLists.sumLists(a, b);

    MinStack minStack = new MinStack();

    minStack.push(10);
    minStack.push(100);

    System.out.println(minStack.getStack());
    System.out.println(minStack.getMinimum());

    minStack.push(2);
    System.out.println(minStack.getStack());
    System.out.println(minStack.getMinimum());


  }
}
