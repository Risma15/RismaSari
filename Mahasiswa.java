/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Mahasiswa {
    String nama;
    private String nim;
    
    Mahasiswa(){
        nama = "Durung darani";
        nim = "17090000";
    }
    
    Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    
    void cetak(){
        System.out.println(nim + " : " + nama);
    }
    void setNim(String nim){
        this.nim = nim;
    }
    
    String getNim(){
        return nim;
    }
}
