/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;
import java.util.Scanner;
/**
 *
 * @author ARJUNA
 */
public class Latihan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan batas bilangan");
        int batas = masukan.nextInt();
        int hasil = 0;
        for(int i=1; i<=batas; i++)
        hasil += i;
         System.out.println(" Total jumlahnya adalah : " + hasil);            
    }
    
}
