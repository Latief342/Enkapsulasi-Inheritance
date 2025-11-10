/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("    Pengujian Keempat Class (Nomor 1-4)   ");
        System.out.println("==========================================");

        System.out.println("\n--- 1. Uji Class Nomor1 (Student dengan setScore) ---");
        try {
            Nomor1 budi = new Nomor1("Budi", 85);
            System.out.println("Awal: " + budi.getName() + " memiliki skor: " + budi.getScore());
            
            budi.setScore(90);
            System.out.println("Set valid: " + budi.getName() + " skor diperbarui: " + budi.getScore());

            System.out.println("Mencoba set skor ke 101...");
            budi.setScore(101); 
            
        } catch (IllegalArgumentException e) {
            System.err.println("Error 1: " + e.getMessage());
        }
 
        System.out.println("\n--- 2. Uji Class Nomor2 (Student dengan add/reduceScore) ---");
        try {
            Nomor2 ani = new Nomor2("Ani", 70);
            System.out.println("Awal: " + ani.getName() + " skor: " + ani.getScore());
            
            ani.addScore(15);
            System.out.println("addScore(15): skor sekarang: " + ani.getScore()); 
            
            ani.reduceScore(5);
            System.out.println("reduceScore(5): skor sekarang: " + ani.getScore()); 

            System.out.println("Mencoba addScore(21) (melebihi 100)...");
            ani.addScore(21); 
            
        } catch (IllegalArgumentException e) {
            System.err.println("Error 2: " + e.getMessage());
        }

        System.out.println("\n--- 3. Uji Class Nomor3 (Team dengan Salinan List) ---");
        try {

            Nomor1 s1 = new Nomor1("Alice", 95);
            Nomor1 s2 = new Nomor1("Bob", 78);
            
            Nomor3 teamA = new Nomor3();
            teamA.addMember(s1);
            teamA.addMember(s2);

            List<Nomor1> teamMembers = teamA.getMembers();
            System.out.println("Anggota awal (internal): " + teamA.getMembers().size()); 

            Nomor1 s3 = new Nomor1("Charlie", 88);
            teamMembers.add(s3); 
            System.out.println("Ukuran list yang dimodifikasi (salinan): " + teamMembers.size());

            System.out.println("Ukuran list internal TeamA setelah dimodifikasi: " + teamA.getMembers().size()); 
            
        } catch (Exception e) {
            System.err.println("Error 3: " + e.getMessage());
        }

        System.out.println("\n--- 4. Uji Class Nomor4 (ImmutableStudent) ---");
        try {
            Nomor4 initial = new Nomor4("Diana", 80);
            System.out.println("Awal: " + initial);

            Nomor4 updated = initial.withAddedScore(15);
            
            System.out.println("Baru (updated): " + updated);
            System.out.println("Asli (initial): " + initial); 
            
            Nomor4 finalUpdate = updated.withAddedScore(5);
            System.out.println("Final (finalUpdate): " + finalUpdate); 

            System.out.println("Mencoba penambahan skor yang tidak valid...");
            finalUpdate.withAddedScore(10); 

        } catch (IllegalArgumentException e) {
            System.err.println("Error 4: " + e.getMessage());
        }
        
        System.out.println("==========================================");
        System.out.println("Pengujian Selesai.");
    }
}