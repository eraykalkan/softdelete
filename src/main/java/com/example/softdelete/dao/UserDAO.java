package com.example.softdelete.dao;

import com.example.softdelete.entity.Kullanici;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<Kullanici,String> {
    @Query("update #{#entityName} e set e.aktif=false where e.id=?1")
    @Modifying
    void deleteById(Integer id);
}