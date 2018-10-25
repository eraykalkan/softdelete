package com.example.softdelete.service;

import com.example.softdelete.dao.UniversiteDAO;
import com.example.softdelete.entity.Universite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UniversiteServiceImpl implements UniversiteService {

    @Autowired
    private UniversiteDAO universiteDAO;

    @Override
    public Universite kaydet(Universite universite) {
        Universite universite1=universiteDAO.save(universite);
        return universite1;
    }

    @Override
    public List<Universite> findAll() {
        return universiteDAO.findAll();
    }
}
