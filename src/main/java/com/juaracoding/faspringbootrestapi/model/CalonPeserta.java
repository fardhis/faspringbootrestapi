package com.juaracoding.faspringbootrestapi.model;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/25/2023 8:16 PM
@Last Modified 7/25/2023 8:16 PM
Version 1.0
*/

public class CalonPeserta {

    private String nama;
    private Integer umur;
    private  Double nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }
}

