package com.juaracoding.faspringbootrestapi.repo;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/27/2023 7:39 PM
@Last Modified 7/27/2023 7:39 PM
Version 1.0
*/

import com.juaracoding.faspringbootrestapi.model.Peserta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

import java.sql.SQLException;
import java.util.List;

@Transactional
public interface PesertaRepo extends JpaRepository <Peserta, Integer>{
    List<Peserta> findByNama(String nama);
    void deleteByNama(String nama);
    int countByBatch(String batch);

    List<Peserta> findTop4ByBatchAndAlamatContaining(String batch, String kota);

    @Query(value = "SELECT * FROM peserta WHERE nama = ?1 and batch = ?2", nativeQuery = true)
    List<Peserta> findPesertaByNamaBatch(String nama, String batch);

    List<Peserta> findTop2ByBatch(String batch);

//    List<Peserta> findByNama(String strNama);//DERIVED QUERY
//    List<Peserta> findByNamaStartsWith(String strNama);//DERIVED QUERY

//    List<Peserta> findTop4ByBatchAndAlamatContaining(String batch, String alamatMengandung);
//    List<Peserta> findTop4ByBatchAndAlamatContains(String batch, String alamatMengandung);
//    List<Peserta> findTop4ByBatchAndAlamatIsContaining(String batch, String alamatMengandung);

}

