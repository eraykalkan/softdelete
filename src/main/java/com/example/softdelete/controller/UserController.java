package com.example.softdelete.controller;

import com.example.softdelete.entity.Kullanici;
import com.example.softdelete.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/kaydet" , method = RequestMethod.POST)
    public Kullanici kisiKaydet(@RequestBody Kullanici user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/softDelete/{id}",method = RequestMethod.GET)
    public void deleteByAktif(@PathVariable Integer id)
    {
        userService.softDelete(id);
        System.out.println("OK");
    }

}
