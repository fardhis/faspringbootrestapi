package com.juaracoding.faspringbootrestapi.model;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/24/2023 9:15 PM
@Last Modified 7/24/2023 9:15 PM
Version 1.0
*/

import java.time.LocalDate;
import java.util.List;

public class XPerson {
    private Long idPerson;
    private String namaLengkap;
    private LocalDate tanggalLahir;
    private  String email;

    private List<XData> xDataList;

    private XBarang xBarang;

    public List<XData> getxDataList() {
        return xDataList;
    }

    public void setxDataList(List<XData> xDataList) {
        this.xDataList = xDataList;
    }

    public XBarang getxBarang() {
        return xBarang;
    }

    public void setxBarang(XBarang xBarang) {
        this.xBarang = xBarang;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

