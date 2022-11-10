package Latihan2_Inheritance;

// Created by 21343043_Fadhil Nugraha WIkarya

public class Employ extends Person{
    private String noKaryawan;

    //konstruktor
    public Employ (String noKaryawan, String name, int age) {
        super(name, age);
        this.noKaryawan = noKaryawan;
    }

    //metode
    public void info() {
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}