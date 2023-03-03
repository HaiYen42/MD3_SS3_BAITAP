package BT3_Gop2Mang;

import java.util.Scanner;

public class CombineTwoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Vui lòng nhập chiều dài mảng A");
        int sizeA= input.nextInt();
        int [] arrA = new int[sizeA];
        for (int i = 0; i <arrA.length ; i++) {
            System.out.println(" Vui lòng nhập phần tử thứ "+ (i+1));
            arrA[i]= input.nextInt();
        }
        System.out.println(" Mảng A là ");
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i]+ "\t");
        }
        System.out.println(" Vui lòng nhập chiều dài mảng B");
        int sizeB= input.nextInt();
        int [] arrB= new int[sizeB];
        for (int i = 0; i <arrB.length;i++) {
            System.out.println(" Vui lòng nhập phần tử thứ "+ (i+1));
            arrB[i]= input.nextInt();
        }
        System.out.println(" Mảng B là ");
        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i]+ "\t");
        }
        int [] newArr= new int [sizeA+ sizeB];
        System.out.println("Mảng mới là: ");
        for (int i = 0; i < newArr.length; i++) {
            if (i<sizeA){
                newArr[i]= arrA[i];
            }else{
                newArr[i]= arrB[i-sizeA];
            }
            System.out.print(newArr[i]+ "\t");
        }
    }
}
