package com.example.softdelete.service;

import com.example.softdelete.entity.Bolum;
import com.example.softdelete.entity.Universite;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface UniversiteService {
    Universite kaydet(Universite universite);
    List<Universite> findAll();
}
