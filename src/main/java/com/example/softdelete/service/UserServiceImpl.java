package com.example.softdelete.service;

import com.example.softdelete.dao.UserDAO;
import com.example.softdelete.entity.Kullanici;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void softDelete(Integer id) {
        userDAO.deleteById(id);
    }

    @Override
    public Kullanici save(Kullanici u) {
        return userDAO.save(u);
    }
}
