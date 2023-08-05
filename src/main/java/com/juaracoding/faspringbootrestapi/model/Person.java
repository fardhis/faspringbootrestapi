package com.juaracoding.faspringbootrestapi.model;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 8/3/2023 9:31 PM
@Last Modified 8/3/2023 9:31 PM
Version 1.0
*/

import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "MstPerson")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPerson")
    private Long idPerson;

    @Column(name = "NamaDepan" , length = 25, nullable = false)
    @Length(min = 5, max = 25)
    @NotNull
    @NotEmpty
    @NotBlank
    private String namaDepan;

    @Column(name = "NamaTengah" , length = 25, nullable = false)
    @Length(min = 5, max = 25)
    @NotNull
    @NotEmpty
    @NotBlank
    private String namaTengah;

    @Column(name = "NamaBelakang" , length = 25, nullable = false)
    @Length(min = 5, max = 25)
    @NotNull
    @NotEmpty
    @NotBlank
    private String namaBelakang;

    @Column(name = "TanggalLahir")
    private LocalDate tanggalLahir;
    @Transient
    private Integer umur;
    @Column(name = "CreatedBy",nullable = false)
    private Long createdBy = 1L;
    @Column(name = "CreatedDate",nullable = false)
    private Date createdDate = new Date();

    @Column(name = "ModifiedBy")
    private Long modifiedBy ;
    @Column(name = "ModifiedDate")
    private Date modifiedDate;

    @Column(name = "IsDelete")
    private Byte isDelete = 1;

    @Column(name = "Alamat")
    private String alamat;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaTengah() {
        return namaTengah;
    }

    public void setNamaTengah(String namaTengah) {
        this.namaTengah = namaTengah;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}


