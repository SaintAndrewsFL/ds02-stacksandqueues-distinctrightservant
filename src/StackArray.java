import java.util.ArrayList;

public class StackArray<t> {
    private ArrayList<t> myStack = new ArrayList<>();

    public boolean push(t item) {
        if (item != null) {
            myStack.add(item);
            return true;
        } else {
            System.out.println("Null entered");
            return false;
        }
    }

    public t dequeue() {
        t temp = myStack.get(myStack.size()-1);
        myStack.remove(myStack.size()-1);
        return temp;
    }

    public t peek() {
        return myStack.get(myStack.size()-1);
    }

    public void display() {
        for (int i = myStack.size()-1; i >= 0; i--) {
            System.out.println(myStack.get(i));
        }
    }

    public int size() {
        return myStack.size();
    }

    public boolean isEmpty() {
        return myStack.isEmpty();

    }
}


/*
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */