package DataStructure.Queue;

public class Queue {
    private QueueNode head;
    private QueueNode tail;
    private int queueSize;

    public Queue(){
        head = tail = null;
        queueSize = 0;
    }

    public void enqueue(String data){
        QueueNode newNode = new QueueNode();
        if (head == null){
            head = tail = newNode;
        }
        else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        queueSize++;

    }
    public void dequeue(){
        if(head == null){
            System.out.println("Kuyruk boş.");
            return;
        }
        else{
            String data = head.data;
            head = head.nextNode;
        }
        queueSize--;

        if(head == null){
            tail = null;
        }
        return;
    }
    public String peek(){
        if (head == null){
            return null;
        }
        else{
            return head.data;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return queueSize;
    }
    public void print(){
        QueueNode pointer = head;
        System.out.println("Kuyruk: ");
        while (pointer != null){
            System.out.println(pointer.data + " -> ");
            pointer = pointer.nextNode;
        }
        System.out.println("null");
    }
}
