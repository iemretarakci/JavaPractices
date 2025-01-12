package Basics;

public class Arrays {
    public static void MainArrays(String[] args){
        String[] myStringArray = new String[3];

        myStringArray[0] = "apple";
        myStringArray[1] = "peach";
        myStringArray[2] = "cherry";

        System.out.println(myStringArray[1]);

        int[] myIntArray = new int[3];
        myIntArray[0] = 50;
        myIntArray[1] = 60;
        myIntArray[2] = 70;
        System.out.print(myIntArray[1]);

    }
}
