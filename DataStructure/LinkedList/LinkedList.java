package DataStructure.LinkedList;

public class LinkedList {
    SingleNode head;

    public void add(String data){
        SingleNode newNode = new SingleNode();
        if(head == null){
            head = newNode;
        }
        else{
            SingleNode temp = head;
            while(temp.nextNode != null){
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }
    }
    public void print(){
        SingleNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.nextNode;
        }
    }
}
