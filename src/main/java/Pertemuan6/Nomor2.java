/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

public class Nomor2 {
    private String name;
    private int score;

    public Nomor2(String name, int score) {
        this.name = name;
        if (score < 0 || score > 100) {
             throw new IllegalArgumentException("Initial score must be between 0 and 100.");
        }
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void addScore(int delta) {
        int newScore = this.score + delta;
        if (newScore > 100) {
            throw new IllegalArgumentException("Cannot add score. New score (" + newScore + ") exceeds 100.");
        }
        this.score = newScore;
    }

    public void reduceScore(int delta) {
        int newScore = this.score - delta;
        if (newScore < 0) {
            throw new IllegalArgumentException("Cannot reduce score. New score (" + newScore + ") drops below 0.");
        }
        this.score = newScore;
    }
}