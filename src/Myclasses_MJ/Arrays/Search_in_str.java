package Myclasses_MJ.Arrays;

import java.util.Arrays;

public class Search_in_str {
    public static void main(String[] args) {
        String name = "Mujahid";
        char target = 'j';
        System.out.println(strSearch2(name, target));

    }

    static boolean strSearch(String s, char target) {
        if (s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (target == s.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean strSearch2(String s, char target) {
        if (s.length() == 0) {
            return false;
        }
        for (char element : s.toCharArray()) {
            if (target == element) {
                return true;
            }
        }
        return false;
    }
}
