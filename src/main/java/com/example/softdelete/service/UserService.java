package com.example.softdelete.service;

import com.example.softdelete.entity.Kullanici;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public interface UserService {
    void softDelete(Integer id);
    Kullanici save(Kullanici u);
}
