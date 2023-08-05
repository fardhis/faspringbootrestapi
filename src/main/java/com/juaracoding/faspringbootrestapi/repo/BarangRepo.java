package com.juaracoding.faspringbootrestapi.repo;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/31/2023 8:51 PM
@Last Modified 7/31/2023 8:51 PM
Version 1.0
*/

import com.juaracoding.faspringbootrestapi.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarangRepo extends JpaRepository<Barang,Long> {
}
