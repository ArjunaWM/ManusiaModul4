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
public class Bis {

    private int penumpang;
    private int maxpenumpang;

    public Bis(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public int getPenumpang(int penumpang) {
        return penumpang;
    }

    public int getMaxpenumpang(int maxpenumpang) {
        return maxpenumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxpenumpang(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
    }

    
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }
    
    public void getpenumpang(int password){
        if (password == 24){
            System.out.println("Password Benar");
        }else {
            System.out.println("Password Salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang sekarang adalah " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah " + maxpenumpang);
    }
}
