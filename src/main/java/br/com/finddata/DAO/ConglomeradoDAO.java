/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.finddata.DAO;

import br.com.finddata.model.Conglomerado;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tiago
 */
@Repository
public interface ConglomeradoDAO extends PagingAndSortingRepository<Conglomerado, Integer> {
    
}
