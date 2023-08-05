package com.juaracoding.faspringbootrestapi.model;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 8/3/2023 8:51 AM
@Last Modified 8/3/2023 8:51 AM
Version 1.0
*/




import com.sun.istack.NotNull;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name = "TestingMstTugasA")
public class TestingTugasA {

    @Id
    @Column(name = "IDTugasA", nullable = false)
    @NotNull
    private String idTugasA;

    @Column(name = "Nama", length = 40, nullable = false)
    @NotNull
    @NotEmpty
    @NotBlank
    private String nama;

    @Column(name = "Alamat", length = 500, nullable = false)
    @NotNull
    private String alamat;

    @Column(name = "TangalLahir", nullable = false)
    @NotNull
    private LocalDate tanggalLahir;

    @Column(name = "JenisKelamin", length = 1, nullable = false)
    @NotNull
    private Character jenisKelamin;

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
    private Short isDelete;

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

    public java.util.Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(java.util.Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }
}

