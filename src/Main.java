public class Main {
    public static void main(String[] args) {
        StackArray<String> myQueueLL = new StackArray<>();
        for(int i = 10; i<20;i++){
            myQueueLL.push(""+i);
        }
        myQueueLL.dequeue();
        myQueueLL.dequeue();
        myQueueLL.display();
        System.out.println();
        System.out.println(myQueueLL.peek());
    }
}