package com.juaracoding.faspringbootrestapi.model;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 8/5/2023 7:44 PM
@Last Modified 8/5/2023 7:44 PM
Version 1.0
*/


import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "MstTugasA")
public class TugasA {

    @Id
    @Column(name = "IDTugasA",length = 255, nullable = false)
    @NotNull
    private String idTugasA;

    @Column(name = "Nama", length = 40, nullable = false)
    @Length(min = 1, max = 40)
    @NotNull
    @NotEmpty
    @NotBlank
    private String nama;

    @Column(name = "Alamat", length = 500, nullable = false)
    @NotNull
    private String alamat;

    @Column(name = "TanggalLahir", nullable = false)
    @NotNull
    private LocalDate tanggalLahir;

    @Column(name = "JenisKelamin", nullable = false)
    @NotNull
    private  Character jenisKelamin;

    @Column(name = "MasihHidup", nullable = false)
    @NotNull
    private Boolean masihHidup;

    @Column(name = "CreatedDate", nullable = false)
    @NotNull
    private Date createdDate;

    @Column(name = "CreatedBy", nullable = false)
    @NotNull
    private Integer createdBy;

    @Column(name = "ModifiedDate")
    private Date modifiedDate;

    @Column(name = "ModifiedBy")
    private Integer modifiedBy;

    @Column(name = "IsDelete", nullable = false)
    @NotNull
    private Byte isDelete;

    public String getIdTugasA() {
        return idTugasA;
    }

    public void setIdTugasA(String idTugasA) {
        this.idTugasA = idTugasA;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Character getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(Character jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Boolean getMasihHidup() {
        return masihHidup;
    }

    public void setMasihHidup(Boolean masihHidup) {
        this.masihHidup = masihHidup;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}

