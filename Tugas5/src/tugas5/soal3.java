/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class soal3 {

    /**
     * @param args the command line arguments
     */
    static int method(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = masuk.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = masuk.nextInt();
        int pbt = method(a, b);
        System.out.println("Pembagi Bersama Terbesarnya adalah: " + pbt);
    }
}