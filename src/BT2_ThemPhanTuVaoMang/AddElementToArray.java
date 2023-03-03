package BT2_ThemPhanTuVaoMang;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(" Phần tử trong mảng là ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ "\t");
        }
        System.out.println(" Vui lòng nhập số cần chèn ");
        int newElement = input.nextInt();
        System.out.println(" Vui lòng nhập vị trí cần chèn ");
        int index = input.nextInt();
        int [] newArr= new int[arr.length+1];
        if (index <=-1 && index>= arr.length) {
            System.out.println(" Ko chèn được vị trí vào mảng ");
        } else{
            System.out.println("Mảng mới là: ");
            for (int i = 0; i <newArr.length ; i++) {
                if (i<index){
                    newArr[i]= arr[i];
                }else if(i==index){
                    newArr[i]=newElement;
                } else{
                    newArr[i]= arr[i-1];
                }
                System.out.print(newArr[i]+ "\t");
            }

        }
    }
}
