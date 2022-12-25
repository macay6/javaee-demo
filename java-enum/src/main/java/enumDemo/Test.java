package enumDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int local = scanner.nextInt();
        if(local <= str.length()) {
            char[] chars = str.toCharArray();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (char aChar : chars) {
                list.add((int) aChar);
            }
            Collections.sort(list);
            for (int i = 0; i < chars.length; i++) {
                if ((int) chars[i] == list.get(local - 1)) {
                    System.out.println(i);
                    break;
                }
            }
        }else {
            System.out.println("");
        }

    }
}
