/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author ARJUNA
 */
public class TestSiswa {

    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Arjuna Wira Mahardika");
        siswa.setAbsen(9);
        siswa.setAddress("Surabaya");       
        System.out.println("Name : " + siswa.getName() + " Absen : " + siswa.getAbsen() + " Address : " + siswa.getAddress());
    }
    
}
