import java.util.ArrayList;
import java.util.LinkedList;

public class QueueLL <t>{
    private Node head;
    private LinkedList<Object> myQueue = new LinkedList<>();
    public boolean enqueue(t item){
        if(item==null){
            System.out.println("Null entered");
            return false;
        }
        Node newNode = new Node(item);
        Node cur = head;
        if(head==null) {
            head = newNode;
            return true;
        }
        else{
            while(true){
                if(cur.getNext()==null){
                    cur.setNext(newNode);
                    //We know it isn't circular so I can while true
                    return true;
                }
                cur = cur.getNext();
            }
        }
    }
    public t dequeue(){
        t temp = head.getData();
        head = head.getNext();
        return temp;
    }
    public t peek(){
        return head.getData();
    }
    public void display(){
        Node cur = head;
        while(cur.getNext()!=null){
            System.out.println(cur.getData());
            cur = cur.getNext();
        }
    }
    public int size(){
        int count = 0;
        Node cur = head;
        while(cur.getNext()!=null){
            count +=1;
            cur = cur.getNext();
        }
        return count;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public class Node{
        private Node Next;
        private t data;
        public Node(t data){
            this.data = data;
        }
        public void setNext(Node next){
            this.Next = next;
        }
        public Node getNext(){
            return Next;
        }
        public void setData(t data){
            this.data = data;
        }
        public t getData(){
            return data;
        }
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