/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.fp.Service;

import com.portfolio.fp.Entity.Skills;
import com.portfolio.fp.Repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SSkills {
    @Autowired
    RSkills rhys;
    
    public List<Skills> list(){
        return rhys.findAll();
    }
    
    public Optional<Skills> getOne(int id){
        return rhys.findById(id);
    }
    
    public Optional<Skills> getByNombre(String nombre){
        return rhys.findByNombre(nombre);
    }
    
    public void save(Skills skill){
        rhys.save(skill);
    }
    
    public void delete(int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsByNombre(nombre);
    }
}
