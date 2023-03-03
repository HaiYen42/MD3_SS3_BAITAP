package BT5_TimGiaTriNhoNhatTrongMang;

import java.util.Scanner;

public class FindMinInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng "+ "\n");
        int size = sc.nextInt();
        int [] arr=  new int[size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Phần tử thứ "+ (i+1)+ " là: ");
            arr[i]= sc.nextInt();
        }
        System.out.println("Mảng là ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min= arr[i];
            }
        }
        System.out.println("\n Giá trị nhỏ nhất của mảng là: "+ min);
    }
}
