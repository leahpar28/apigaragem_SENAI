/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.raphael.apigaragem.service;

import br.gm.raphael.apigaragem.entities.Veiculo;
import br.gm.raphael.apigaragem.repositories.veiculoRepositories;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digma
 */

@Service
public class VeiculoService {
    
    @Autowired
    private veiculoRepositories veiculoRepositories;
    
    //SERVICE -> LISTA INTEIRA
    public List<Veiculo> findAll(){
       
        List<Veiculo> result = veiculoRepositories.findAll();
        return result;    
    }
    
    //SERCVICE -> LISTA POR ID
    public List<Veiculo> findById(long id){
        
        List<Veiculo> result = veiculoRepositories.findById(id);
        return result;
    }
    
    //SERVICE -> LISTA POR COR
    public List<Veiculo> findByCorIgnoreCase(String cor){
        
        List<Veiculo> result = veiculoRepositories.findByCorIgnoreCase(cor);
        return result;
    }
    
}
