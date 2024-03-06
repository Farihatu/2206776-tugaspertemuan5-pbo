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
public class soal1 {
    /**
     * @param args the command line arguments
     */
    static void method(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = masuk.nextInt();
        method(N);
    }
}