package Latihan5_Encapsulation;

// Created by 21343043_Fadhil Nugraha Wikarya

public class Bus {
    public int penumpang;
    public int maxPenumpang;

    public void cetak() {
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}