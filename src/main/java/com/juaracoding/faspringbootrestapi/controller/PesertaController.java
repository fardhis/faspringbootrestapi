package com.juaracoding.faspringbootrestapi.controller;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/27/2023 7:49 PM
@Last Modified 7/27/2023 7:49 PM
Version 1.0
*/

import com.juaracoding.faspringbootrestapi.model.Peserta;
import com.juaracoding.faspringbootrestapi.repo.PesertaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peserta")
public class PesertaController {

    @Autowired
    PesertaRepo pesertaRepo;

    @GetMapping("/")
    public List<Peserta> getAllData() {
        List<Peserta> daftarPeserta = pesertaRepo.findAll();
        return daftarPeserta;
    }

    @PostMapping("/")
    public String postData(@RequestBody Peserta peserta) {
        pesertaRepo.save(peserta);
        return peserta.getNama() + " berhasil ditambahkan";
    }

    @PostMapping("/batch")
    public String postData(@RequestBody List<Peserta> peserta) {
        pesertaRepo.saveAll(peserta);
        return peserta.size()+" data berhasil ditambahkan";
    }

    @GetMapping("/search-peserta-by-id")
    public Peserta searchPesertaById(@RequestParam(value = "id") Integer id) {
        Optional<Peserta> hasil = pesertaRepo.findById(id);
        return hasil.get();
    }

    @GetMapping("/search-peserta-by-nama")
    public List<Peserta> searchPesertaByNama(@RequestParam(value = "nama") String nama) {
        List<Peserta> hasil = pesertaRepo.findByNama(nama);
        return hasil;
    }

    @PostMapping("/delete-peserta-by-nama")
    public String deletePesertaByNama(@RequestParam(value = "nama") String nama) {
        pesertaRepo.deleteByNama(nama);
        return "Peserta bernama " + nama + " berhasil dihapus";
    }

    @GetMapping("/count-peserta-by-batch")
    public int countPesertaByBatch(@RequestParam(value = "batch") String batch) {
        int hasil = pesertaRepo.countByBatch(batch);
        return hasil;
    }

    @GetMapping("/search-4-peserta-by-batch-and-kota")
    public List<Peserta> searchPesertaByBatchAndKota(@RequestParam(value = "batch") String batch,
                                                     @RequestParam(value = "kota") String kota) {
        List<Peserta> hasil = pesertaRepo.findTop4ByBatchAndAlamatContaining(batch, kota);
        return hasil;
    }

    @GetMapping("/search-peserta-by-nama-and-batch")
    public List<Peserta> searchPesertaByNamaAndBatch(@RequestParam(value = "nama") String nama, @RequestParam(value = "batch") String batch) {
        List<Peserta> hasil = pesertaRepo.findPesertaByNamaBatch(nama, batch);
        return hasil;
    }

    @GetMapping("/findtop/{id}")
    public List<Peserta> findTop3ByBatch(@PathVariable(value = "id") String strBatch){
    List<Peserta> peserta = pesertaRepo.findTop2ByBatch(strBatch);
    return peserta;
    }

}


