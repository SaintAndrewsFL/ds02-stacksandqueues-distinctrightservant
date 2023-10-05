import java.util.ArrayList;

public class QueueArray<t> {
    private ArrayList<t> myQueue = new ArrayList<>();
    public boolean enqueue(t item){
        if(item!=null) {
            myQueue.add(item);
            return true;
        }
        else{
            System.out.println("Null entered");
            return false;
        }
    }
    public t dequeue(){
        t temp = myQueue.get(0);
        myQueue.remove(0);
        return temp;
    }
    public t peek(){
        t temp = myQueue.get(0);
        return temp;
    }
    public void display(){
        for(int i = 0; i<=myQueue.size(); i++){
            System.out.println(myQueue.get(i));
        }
    }
    public int size(){
        return myQueue.size();
    }
    public boolean isEmpty(){
        return myQueue.isEmpty();
    }
}




/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */
