/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Aplikasi {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("17090052", "Risma Sari");
        Mahasiswa mhs2 = new Mahasiswa("17090122", "Ianatul Khoeriyah");
        
        mhs1.cetak();
        mhs2.cetak();
        System.out.println(mhs1.getNim());
//        System.out.println(mhs1.nim + " : " +
//                mhs1.nama);
//        System.out.println(mhs2.nim + " :" +
//                mhs2.nama);
    }
    
}
