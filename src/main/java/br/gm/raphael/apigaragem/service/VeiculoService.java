/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.raphael.apigaragem.service;

import br.gm.raphael.apigaragem.DTO.VeiculoMinDTO;
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
    //esse eu preciso do DTO
    
    //esse é o (/garagem/forsale)
 
    public List<VeiculoMinDTO> findAll(){
       List<Veiculo> resultVeiculo = veiculoRepositories.findAll();
       
       List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
       return resultDTO;
          
    }
    
    //SERCVICE -> LISTA POR ID
    //esse eu NÂO preciso do DTO
    public List<Veiculo> findById(long id){
        
        List<Veiculo> result = veiculoRepositories.findById(id);
        return result;
    }
    
    //SERVICE -> LISTA POR COR
    //esse eu preciso do DTO
    public List<VeiculoMinDTO> findByCorIgnoreCase(String cor){
        List<Veiculo> resultVeiculo = veiculoRepositories.findByCorIgnoreCase(cor);
        
        List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();
        return resultDTO;
    }
    
    //esse eu preciso do DTO
    public List<Veiculo> findByAno(int ano){
        
        List<Veiculo> result = veiculoRepositories.findByAno(ano);
        return result;
    }
}
