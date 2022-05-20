package may16;

import java.util.LinkedList;

public class MinStack {

  private LinkedList<Integer> minimum;
  private LinkedList<Integer> stack;

  MinStack() {
    this.stack = new LinkedList<>();
    this.minimum = new LinkedList<>();
  }

  public void push(Integer i) {
    stack.push(i);
    if (stack.size() == 1 || i <= minimum.peek()) minimum.push(i);
  }

  public Integer pop() {
    int i = stack.pop();
    if (i == minimum.peek()) minimum.pop();
    return i;
  }

  public int min() {
    return minimum.peek();
  }

  public LinkedList<Integer> getMinimum() {
    return minimum;
  }

  public LinkedList<Integer> getStack() {
    return stack;
  }

}
