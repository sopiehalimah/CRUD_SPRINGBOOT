/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.springboot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import sh.springboot.domain.Buah;

/**
 *
 * @author sopie
 */
public interface BuahDao extends PagingAndSortingRepository<Buah, String>{
    
}