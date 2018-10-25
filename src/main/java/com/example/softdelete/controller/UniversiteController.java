package com.example.softdelete.controller;

import com.example.softdelete.entity.Bolum;
import com.example.softdelete.entity.Universite;
import com.example.softdelete.service.UniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniversiteController {

    @Autowired
    private UniversiteService universiteService;

    @RequestMapping(value = "/universiteKaydet" , method = RequestMethod.GET)
    public Universite add() {
        Universite universite=new Universite("Hacettepe");
        universite.addBolum(new Bolum("Patates"));
        universite.addBolum(new Bolum("Armut"));
        Universite universite1=universiteService.kaydet(universite);
        //System.out.println("Universite :" +universite1.toString());
        return null;
    }

    @RequestMapping(value = "/get" , method = RequestMethod.GET)
    public List<Universite> get() {
        return universiteService.findAll();
    }
}
