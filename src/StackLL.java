import java.util.LinkedList;

public class StackLL<t> {
    private Node head;
    private LinkedList<Object> myStack = new LinkedList<>();
    public boolean enqueue(t item){
        if(item==null){
            System.out.println("Null entered");
            return false;
        }
        Node newNode = new Node(item);
        Node temp = head;
        if(head==null) {
            head = newNode;
            return true;
        }
        else{
            newNode.setNext(head);
            head = newNode;
            return true;
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
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */