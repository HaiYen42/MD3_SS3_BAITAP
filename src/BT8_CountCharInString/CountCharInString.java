package BT8_CountCharInString;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input String: ");
        String str= input.next();
        System.out.println("Input Character: ");
        char charText= input.next().charAt(0);
        int count=0;
        for (int i = 0; i <str.length();  i++) {
            if (str.charAt(i)==charText){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của "+ charText+ " trong "+ str+ "là "+ count);
    }
}
