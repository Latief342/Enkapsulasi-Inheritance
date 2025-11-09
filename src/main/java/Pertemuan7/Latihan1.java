/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

public class Latihan1 {

    // Class dasar (Parent Class)
    public static class Vehicle {
        String brand;

        public Vehicle(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return brand;
        }

        void start() {
            System.out.println("Vehicle starts.");
        }
    }

    // Class turunan Car (Subclass)
    public static class Car extends Vehicle {
        public Car(String brand) {
            super(brand);
        }

        @Override
        void start() {
            System.out.println(getBrand() + " Car starts with the push of a button.");
        }
    }

    // Class turunan Motorcycle (Subclass)
    public static class Motorcycle extends Vehicle {
        public Motorcycle(String brand) {
            super(brand);
        }

        @Override
        void start() {
            System.out.println(getBrand() + " Motorcycle starts with a kick.");
        }
    }

    // Method main untuk pengujian
    public static void main(String[] args) {
        // Buat array Vehicle[] yang berisi objek Car dan Motorcycle
        Vehicle[] vehicles = new Vehicle[4];
        
        vehicles[0] = new Car("Tesla");
        vehicles[1] = new Motorcycle("Honda");
        vehicles[2] = new Car("Toyota");
        vehicles[3] = new Motorcycle("Harley");

        System.out.println("--- Memulai Semua Kendaraan ---");
        
        // Panggil start() pada tiap elemen array (Polimorfisme bekerja di sini)
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}