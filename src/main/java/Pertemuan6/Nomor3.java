/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class Nomor3 {
    private List<Nomor1> members;

    public Nomor3() {
        this.members = new ArrayList<>();
    }

    public void addMember(Nomor1 s) {
        if (s != null && !members.contains(s)) {
            members.add(s);
        }
    }

    public List<Nomor1> getMembers() {
        // Mengembalikan salinan (shallow copy) dari List internal
        return new ArrayList<>(this.members);
    }
}