package com.example.softdelete.service;

import com.example.softdelete.entity.Personel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;

@Service
@Transactional
public interface PersonelService {
    Personel personelKaydet(Personel personel);
    List<Personel> findAll();
}
