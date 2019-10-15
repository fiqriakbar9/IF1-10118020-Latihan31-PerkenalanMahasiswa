/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkenalanmahasiswa;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program data diri mahasiswa 
 * berbasis objek oriented
 */
public class Mahasiswa {
     public String nama;
    public String nim;
    
    public void perkenalkanDiri(String parNim, String parNama){
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is "+parNim);
        System.out.println("My Name is "+parNama);
        System.out.println("\nFiqri Akbar Pratama");
        
    }
}
