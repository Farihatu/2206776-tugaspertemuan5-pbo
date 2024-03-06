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
public class soal2 {
    /**
     * @param args the command line arguments
     */
    static void method(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlah += i;
            }
        }
        System.out.println("Jumlah deret bilangan genap: " + jumlah);
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan batasAwal: ");
        int batasAwal = masuk.nextInt();
        System.out.print("Masukkan batasAkhir: ");
        int batasAkhir = masuk.nextInt();
        method(batasAwal, batasAkhir);
    } 
}