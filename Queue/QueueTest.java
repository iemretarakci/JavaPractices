package DataStructure.Queue;

public class QueueTest {
    public static void main(String[] args){
        Queue myQueue = new Queue();
        myQueue.enqueue("İl Kağan");
        myQueue.enqueue("İl Bay");
        myQueue.enqueue("İl Basan");
        myQueue.enqueue("İl Teber");
        myQueue.enqueue("İl Tutmuş");

        myQueue.print();

        System.out.println("Sıranın Başı: " + myQueue.peek());
        System.out.println("Sıranın Boyutu: " + myQueue.size());

        myQueue.dequeue();
        myQueue.print();

        System.out.println("Sıranın Başı: " + myQueue.peek());
        System.out.println("Sıranın Boyutu: " + myQueue.size());

        myQueue.dequeue();
        myQueue.print();

        System.out.println("Sıranın Başı: " + myQueue.peek());
        System.out.println("Sıranın Boyutu: " + myQueue.size());

        myQueue.dequeue();
        myQueue.print();

        System.out.println("Sıranın Başı: " + myQueue.peek());
        System.out.println("Sıranın Boyutu: " + myQueue.size());

        myQueue.dequeue();
        myQueue.print();

        System.out.println("Sıranın Başı: " + myQueue.peek());
        System.out.println("Sıranın Boyutu: " + myQueue.size());

        myQueue.dequeue();
        myQueue.print();

        System.out.println("Sıranın Başı: " + myQueue.peek());
        System.out.println("Sıranın Boyutu: " + myQueue.size());
    }


}
