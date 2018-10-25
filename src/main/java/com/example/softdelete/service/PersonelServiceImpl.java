package com.example.softdelete.service;

import com.example.softdelete.dao.PersonelDAO;
import com.example.softdelete.entity.Personel;
import com.example.softdelete.entity.PersonelGorev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class PersonelServiceImpl implements PersonelService {

    @Autowired
    private PersonelDAO personelDAO;

    @Override
    public Personel personelKaydet(Personel personel) {

        /*for(PersonelGorev personelGorev : personel.getPersonelGorevList()) {
            personelGorev.setPersonel(personel);
        }*/


        personel.getPersonelGorevList().forEach(personelGorev -> personelGorev.setPersonel(personel));

        Personel personel1=personelDAO.save(personel);
        return personel1;
    }

    @Override
    public List<Personel> findAll() {
        return personelDAO.findAll();
    }
}
