public class Main {
    public static void main(String[] args) {
        QueueArray<String> myQueueLL = new QueueArray<>();
        for(int i = 0; i<10;i++){
            myQueueLL.enqueue(""+i);
        }
        System.out.println(myQueueLL.size());
    }
}