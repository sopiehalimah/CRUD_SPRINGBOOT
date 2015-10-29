/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.springboot.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sh.springboot.domain.Buah;

/**
 *
 * @author sopie
 */
@RestController

public class HomeController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World !";
    }
    
    @RequestMapping(value = 
            "/buah",method = RequestMethod.GET)
    Buah getBuah() {
        Buah p = new Buah();
        p.setNama("Jeruk");
        p.setRasa("Masam");
        
        return p;
    }
    
    @RequestMapping(value = "/ListBuah",method = RequestMethod.GET)
    List<Buah> getListBuah() {
        
        List<Buah> buahs = new ArrayList<Buah>();
        Buah p = new Buah();
        p.setNama("Manggis");
        p.setRasa("Masam");
        
        Buah p1 = new Buah();
        p1.setNama("Mangga");
        p1.setRasa("Manis");
        
        buahs.add(p);
        buahs.add(p1);
        
        return buahs;
    }
}
