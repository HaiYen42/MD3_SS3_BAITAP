package BT7_TongDuongCheoCuaMaTran;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][] matrix= new int [5][5];
        int total=0;
        System.out.println("Ma trận là: ");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                matrix[i][j]= (int)(Math.random()*50);
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i) {
                    total+= matrix[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo của matrix là "+ total);
    }
}
