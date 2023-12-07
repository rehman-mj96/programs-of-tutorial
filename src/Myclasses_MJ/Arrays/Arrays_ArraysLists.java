package Myclasses_MJ.Arrays;

public class Arrays_ArraysLists {
    public static void main(String[] args) {
        //syntax :
        // Datatype[] variable_name = new datatype[size];\
        // store 5 roll no. 
//        int[] rollno = new int[5];
        //or directly
//        int[]  rollNo = {22, 38, 45, 11, 78};
        int[] ros ; // declaration  of array. ros is getting defined in the stack
        ros = new int[5]; //initialisation: here object is being created in the memory (heap)

        String[] str = new String[4];
        
        System.out.println(str[1]);
    }
}
