package com.example.fachrezifadel.fadelf_1202150035_mosul2;

public class PilihMenu {
    int foto;
    String nama;
    int harga;
    String komposisi;

    public PilihMenu(int foto, String nama, int harga, String komposisi) {
        this.foto = foto;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi() {
        return komposisi;
    }
}
