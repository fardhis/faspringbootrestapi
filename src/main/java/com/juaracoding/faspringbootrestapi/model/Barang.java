package com.juaracoding.faspringbootrestapi.model;

import com.juaracoding.faspringbootrestapi.repo.PesertaRepo;
import com.sun.istack.NotNull;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/31/2023 8:33 PM
@Last Modified 7/31/2023 8:33 PM
Version 1.0
*/
@Entity
@Table(name = "MstBarang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBarang")
    private Long idBarang;
    @Column(name = "NamaBarang")
    private String namaBarang;

    @Column(name = "Merk")
    private String merk;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDKategoriBarang", referencedColumnName = "IdKategoriBarang")
    private KategoriBarang kategoriBarang;

    public Long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Long idBarang) {
        this.idBarang = idBarang;
    }

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

    public KategoriBarang getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(KategoriBarang kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }
}

