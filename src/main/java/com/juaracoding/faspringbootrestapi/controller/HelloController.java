package com.juaracoding.faspringbootrestapi.controller;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/25/2023 5:13 PM
@Last Modified 7/25/2023 5:13 PM
Version 1.0
*/


import com.juaracoding.faspringbootrestapi.model.CalonPeserta;
import com.juaracoding.faspringbootrestapi.util.FileUtility;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
    @RequestMapping("/hello")
    public class HelloController {
        @GetMapping("/permisi")
        public String firtPage(){
            return "welcome";
        }

        @PostMapping("/seleksi")
        public String seleksiCalonPeserta(@RequestBody CalonPeserta calon) {

            try {
                if (calon.getNilai() > 80 && calon.getUmur() >= 18 && calon.getUmur() <= 60) {
                    return calon.getNama() + " lolos seleksi";
                } else {
                    return calon.getNama() + " tidak lolos seleksi";
                }
            } catch (Exception e) {
                return "Data input error";
            }
        }

        @PostMapping("/seleksi2")
        public String seleksiCalonPeserta2(@RequestParam(value = "nama") String nama,
                                               @RequestParam(value = "umur") Integer umur,
                                               @RequestParam(value = "nilai") Integer nilai) {

                try {
                    if (nilai > 80 && umur >= 18 && nilai <= 60) {
                        return nama + " lolos seleksi";
                    } else {
                        return nama + " tidak lolos seleksi";
                    }
                } catch (Exception e) {
                    return "Data input error";
                }
        }


        @PostMapping("/kirim-file")
        public String submitFile(@RequestParam(value = "kiriman") MultipartFile file) throws IOException {
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            String uploadDir = "user-files/";
            FileUtility.saveFile(uploadDir, fileName, file);
            return "Berhasil mengunggah file " + fileName;
        }




    }





