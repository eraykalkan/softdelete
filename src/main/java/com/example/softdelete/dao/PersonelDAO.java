package com.example.softdelete.dao;

import com.example.softdelete.entity.Personel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonelDAO extends CrudRepository<Personel,Long> {
    List<Personel> findAll();
}
