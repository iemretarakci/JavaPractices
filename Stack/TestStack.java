package DataStructure.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Sarı Yılan");
        stack.push("Koçkar");
        stack.push("Bozdoğan");

        stack.print();

        System.out.println("Tepe eleman: " + stack.peek());
        System.out.println("Eleman sayısı: " + stack.getStackSize());
        System.out.println("Stack boş mu ?\n" + stack.isEmpty());

        stack.pop();

        stack.print();

        System.out.println("Tepe eleman: " + stack.peek());
        System.out.println("Eleman sayısı: " + stack.getStackSize());
        System.out.println("Stack boş mu ?\n" + stack.isEmpty());

        stack.pop();

        stack.print();

        System.out.println("Tepe eleman: " + stack.peek());
        System.out.println("Eleman sayısı: " + stack.getStackSize());
        System.out.println("Stack boş mu ?\n" + stack.isEmpty());

        stack.pop();

        stack.print();

        System.out.println("Tepe eleman: "+ stack.peek());
        System.out.println("Eleman sayısı: " + stack.getStackSize());
        System.out.println("Stack boş mu ?\n" + stack.isEmpty());



    }
}
