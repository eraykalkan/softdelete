package com.example.softdelete.dao;

import com.example.softdelete.entity.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversiteDAO extends CrudRepository<Universite,Long> {
    List<Universite> findAll();
}
