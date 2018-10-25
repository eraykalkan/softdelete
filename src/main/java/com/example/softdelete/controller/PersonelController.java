package com.example.softdelete.controller;

import com.example.softdelete.entity.Bolum;
import com.example.softdelete.entity.Personel;
import com.example.softdelete.entity.PersonelGorev;
import com.example.softdelete.entity.Universite;
import com.example.softdelete.service.PersonelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "personel")
public class PersonelController {

    @Autowired
    private PersonelService personelService;

    @RequestMapping(value = "/kaydet" , method = RequestMethod.POST)
    public Personel add(@RequestBody Personel p) {

        /*Personel personel=new Personel();
        personel.setAd("armut");
        PersonelGorev personelGorev=new PersonelGorev();
        personelGorev.setGorevAdi("amele");
        personel.addGorev(personelGorev);*/

        Personel personel=personelService.personelKaydet(p);


        return personel;
    }

    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public List<Personel> findAll() {

        return personelService.findAll();
    }
}
