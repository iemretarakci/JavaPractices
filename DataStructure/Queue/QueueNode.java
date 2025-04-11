package DataStructure.Queue;

public class QueueNode {
    public String data;
    public QueueNode nextNode;

    public void QueueNode(String data){
        this.data = data;
        this.nextNode = null;
    }
}
