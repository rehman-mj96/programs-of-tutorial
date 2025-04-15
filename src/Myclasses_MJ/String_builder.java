package Myclasses_MJ;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0;
        System.out.println(sb.charAt(2));

        // set char at index 
        sb.setCharAt(2, 'm');
        System.out.println(sb);
    }
}
