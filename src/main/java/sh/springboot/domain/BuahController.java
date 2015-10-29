/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.springboot.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sh.springboot.service.BuahDao;

/**
 *
 * @author sopie
 */
@RestController
@RequestMapping("/api/buah")
public class BuahController {
    @Autowired
    private BuahDao buahDao;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Buah finBuahById(@PathVariable String id){
        return buahDao.findOne(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody Buah p){
        buahDao.save(p);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public Page<Buah> findAll(Pageable pageable){
        return buahDao.findAll(pageable);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        Buah p = buahDao.findOne(id);
        if (p != null){
            buahDao.delete(p);
        }
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void edit(@PathVariable String id, @RequestBody Buah p){
         Buah buah = buahDao.findOne(id);
         if (buah != null) {
             p.setId(id);
             buahDao.save(p);
            
        }
            
        }
    }
    


