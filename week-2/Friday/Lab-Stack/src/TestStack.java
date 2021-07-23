
public class TestStack {

  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(1);
    stack.push(2);

    int value = stack.pop();

    System.out.println(value);
    System.out.println(value);
    
    public void push(int newItem) {

    	  int index = items.length; // get current length to store as index
    	  System.out.println("The array length is: " + index);

    	  items = new int[items.length + 1]; // increase the array by 1 
    	  System.out.println("items after extending the length by 1: " + items);

    	  items[index] = newItem; // store the value in the index
    	  System.out.println("items after storing the new value: "+ items);

    	  lastItem = newItem; // update lastItem
    	  System.out.println("The last item: " + lastItem);
    	}
  }
}