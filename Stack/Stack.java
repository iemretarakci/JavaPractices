package DataStructure.Stack;

public class Stack {
    private StackNode head;
    private int stackSize;

    public Stack(){
        head = null;
        stackSize = 0;
    }

    public void push(String data){
        StackNode newNode = new StackNode(data);
        newNode.nextNode = head;
        head = newNode;
        stackSize++;
    }
    public String pop(){
        if (isEmpty()){
            System.out.println("Stack boş.");
            return null;
        }
        else{
            String data = head.data;
            head = head.nextNode;
            stackSize--;
            return data;
        }
    }
    public String peek(){
        if (isEmpty()) return null;
        return head.data;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int getStackSize(){
        return stackSize;
    }
    public void print(){
        StackNode pointer = head;
        System.out.println("Stack [En Üst -> Alt]: ");
        while(pointer != null){
            System.out.println(pointer.data + " ");
            pointer = pointer.nextNode;
        }
        System.out.println();
    }
}
