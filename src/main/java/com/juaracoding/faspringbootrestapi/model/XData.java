package com.juaracoding.faspringbootrestapi.model;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/24/2023 9:11 PM
@Last Modified 7/24/2023 9:11 PM
Version 1.0
*/

public class XData {

    public class xData {

        private long id;
        private String nama;
        private String janisKelamin;
        private Integer umur;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getJanisKelamin() {
            return janisKelamin;
        }

        public void setJanisKelamin(String janisKelamin) {
            this.janisKelamin = janisKelamin;
        }

        public Integer getUmur() {
            return umur;
        }

        public void setUmur(Integer umur) {
            this.umur = umur;
        }
    }


}

