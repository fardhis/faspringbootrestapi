package com.juaracoding.faspringbootrestapi.controller;
/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/31/2023 8:53 PM
@Last Modified 7/31/2023 8:53 PM
Version 1.0
*/

import com.juaracoding.faspringbootrestapi.configuration.ConfigSMTPConfiguration;
import com.juaracoding.faspringbootrestapi.dto.BarangDTO;
import com.juaracoding.faspringbootrestapi.model.Barang;
import com.juaracoding.faspringbootrestapi.repo.BarangRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/barang")
public class BarangController {

    @Autowired
    BarangRepo barangRepo;

    @Autowired
    ModelMapper modelMapper;


    @GetMapping("/List")
    public List<BarangDTO> getListBarang()
    {
        List<Barang> barangList = barangRepo.findAll();
        List<BarangDTO> listBarangDTO = modelMapper.map(barangList, new TypeToken<List<BarangDTO>>() {}.getType());

        return listBarangDTO;
    }

    @GetMapping("/callconfig")
    public String getConfig()
    {
        System.out.println(ConfigSMTPConfiguration.getEmailHost());
//        System.out.println(ConfigSMTPConfiguration.getEmailUsername());
        System.out.println(ConfigSMTPConfiguration.getEmailPassword());

        return ConfigSMTPConfiguration.getEmailHost();
    }

}


