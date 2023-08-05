package com.juaracoding.faspringbootrestapi.dto;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/31/2023 9:27 PM
@Last Modified 7/31/2023 9:27 PM
Version 1.0
*/

public class BarangDTO {

    private String namaBarang;
    private String merk;

    private KategoriBarangDTO kategoriBarang;

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public KategoriBarangDTO getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(KategoriBarangDTO kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }
}

