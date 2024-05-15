package Tugas;

import java.util.Scanner;

public class TitikScavengerHunt {
    private String pertanyaan;
    private String jawaban;
    private String lokasi;
    private String deskripsi;
    private TitikScavengerHunt titikBerikutnya;

    public TitikScavengerHunt(String pertanyaan, String jawaban, String lokasi, String deskripsi) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.titikBerikutnya = null;
    }

    public TitikScavengerHunt getTitikBerikutnya() {
        return titikBerikutnya;
    }

    public void setTitikBerikutnya(TitikScavengerHunt titikBerikutnya) {
        this.titikBerikutnya = titikBerikutnya;
    }

    public boolean periksaJawaban(String jawabanPengguna) {
        return jawaban.equalsIgnoreCase(jawabanPengguna);
    }

    public void tampilkanInformasi() {
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Pertanyaan: " + pertanyaan);
    }
}