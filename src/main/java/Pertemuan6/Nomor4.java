/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

public final class Nomor4 {
    private final String name;
    private final int score;

    public Nomor4(String name, int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Initial score must be between 0 and 100.");
        }
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Nomor4 withAddedScore(int delta) {
        int newScore = this.score + delta;
        
        if (newScore < 0 || newScore > 100) {
            throw new IllegalArgumentException("Score update results in an invalid score: " + newScore);
        }
        
        // Mengembalikan objek BARU
        return new Nomor4(this.name, newScore);
    }
    
    @Override
    public String toString() {
        return "ImmutableStudent{" + "name='" + name + '\'' + ", score=" + score + '}';
    }
}