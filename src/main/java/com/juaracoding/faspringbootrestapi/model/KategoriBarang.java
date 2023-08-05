package com.juaracoding.faspringbootrestapi.model;

import javax.persistence.*;

/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/31/2023 8:13 PM
@Last Modified 7/31/2023 8:13 PM
Version 1.0
*/
@Entity
@Table(name  = "MstKategoriBarang")
public class KategoriBarang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKategoriBarang")
    private Long idKategoriBarang;

    @Column(name = "KategoriBarang")
    private String kategoriBarang;

    public Long getIdKategoriBarang() {
        return idKategoriBarang;
    }

    public void setIdKategoriBarang(Long idKategoriBarang) {
        this.idKategoriBarang = idKategoriBarang;
    }

    public String getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(String kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }
}

