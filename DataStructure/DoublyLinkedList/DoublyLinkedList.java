package DataStructure.DoublyLinkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;

    public void add(String data){
        DoublyNode newNode = new DoublyNode();
        if (head == null){
            head = tail = newNode;
        }
        else{
            tail.nextNode = newNode;
            newNode.prevNode = tail;
            tail = newNode;
        }
    }
    public void print(){
        DoublyNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
    }
}
