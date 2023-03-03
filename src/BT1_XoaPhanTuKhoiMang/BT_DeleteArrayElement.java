package BT1_XoaPhanTuKhoiMang;

import java.util.Scanner;

public class BT_DeleteArrayElement {
//    public static void main(String[] args) {
//        // Khởi tạo 1 biến là input với Class là Scanner nhận thông tin từ Class system với phương thức in trả ra
//        //Tạo 1 mảng 1 chiều với tên là arr với kiểu dữ liệu int với  giá trị khởi tạo sẵn {}
//        Scanner input = new Scanner(System.in);
//        int [] array = {10,8,9,3,5,6,4,3,2,1};
//        // In ra mảng vừa tạo
//        System.out.println(" Phần tử trong mảng là");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+ "\t");
//        }
//
//        //NHập vào số cần xóa và khởi tạo biến deleteElement  kiểu int,
//        // nhận giá trị từ input-> nextInt để phân loại
//        System.out.println(" Vui lòng nhập số cần xóa");
//        int deleteElement = input.nextInt();
//
//        //Khởi tạo index = -1, chạy vòng for để tìm arr[i]==deleteElemnt
//        int index= -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == deleteElement) {
//                index = i;
//                break;
//            }
//        }
//
//        //Tạo 1 mảng mới newArr có chiều dài = size -1
//        int [] newArr = new int[array.length-1];
//
//        // Nếu index <0 --> In ra là "ko tìm thấy phần tử đó"
//        //Ngược lại thì in mảng mới phần gộp newArr[i]+ newArr[i+1]
//        if (index <0) {
//            System.out.println(" Kho tìm thấy phần tử muốn xóa");
//        }else{
//            System.out.println(" Mảng mới là: ");
//            for (int i = 0; i < newArr.length; i++) {
//                if (i <index) {
//                    newArr[i]= array[i];
//                }else{
//                    newArr[i]= array[i+1];
//                }
//                System.out.print(newArr[i]+ "\t");
//            }
//        }
//    }

    public static void main(String[] args) {
        // Khởi tạo 1 biến là input với Class là Scanner nhận thông tin từ Class system với phương thức in trả ra
        //Tạo 1 mảng 1 chiều với tên là arr với kiểu dữ liệu int với  giá trị khởi tạo sẵn {}
        Scanner input = new Scanner(System.in);
        int [] arr= {10,8,9,3,5,6,4,3,2,1};
        // In ra mảng vừa tạo
        System.out.println(" Phần tử trong mảng là ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }

        //NHập vào số cần xóa và khởi tạo biến deleteElement  kiểu int,
        // nhận giá trị từ input-> nextInt để phân loại
        System.out.println(" Số cần xóa là ");
        int deleteElement = input.nextInt();

        //Khởi tạo index = -1, chạy vòng for để tìm arr[i]==deleteElemnt
        int index = -1;
        for (int i = 0; i <arr.length ; i++) {
            if(deleteElement== arr[i]){
                index= i;
            }
        }

        //Tạo 1 mảng mới newArr có chiều dài = size -1
        int [] newArr = new int[arr.length-1];

        // Nếu index <0 --> In ra là "ko tìm thấy phần tử đó"
        //Ngược lại thì in mảng mới phần gộp newArr[i]+ newArr[i+1]
        if (index<0){
            System.out.print(" Ko tìm thấy phần tử đó ");
        } else{
            System.out.println(" Mảng mới là: ");
            for (int i = 0; i <newArr.length ; i++) {
                if (i<index){
                    newArr[i]= arr[i];
                } else{
                    newArr[i]= arr[i+1];
                }
                System.out.print(newArr[i]+ "\t");
            }
        }


    }
}
