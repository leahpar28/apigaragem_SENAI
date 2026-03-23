/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.raphael.apigaragem.controller;

import br.gm.raphael.apigaragem.DTO.VeiculoMinDTO;
import br.gm.raphael.apigaragem.entities.Veiculo;
import br.gm.raphael.apigaragem.service.VeiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digma
 */

@RestController
public class VeiculoController {
    
    @Autowired
    private VeiculoService veiculoService;
    
    
    // TODO: Converter em VeiculoDTO 
    //EM RESUMO, SÓ FALTA EU PEGAR O DTO DESSA PARTE, ELA ESTÁ VINDO AS INFOS COMPLETAS
    //SÓ QUERO NOME DO VEICULO/MARCA/MODELO/COR/ANO/KM/LINKIMAGEM
    
    //Não precisa do minDTO
    @GetMapping("/garagem/{id}")
    public List<Veiculo> findById(@PathVariable long id){
        List<Veiculo> result = veiculoService.findById(id);
        return result;  
        
    } 
    
    //precisa do minDTO
    @GetMapping("/garagem")
    public List<VeiculoMinDTO> findAll(){
        List<VeiculoMinDTO> result = veiculoService.findAll();
        return result;    
    }
    
    //precisa do minDTO - COLOQUEI O DTO 
    @GetMapping("/garagem/color/{cor}")
    public List<VeiculoMinDTO> findByCorIgnoreCase(@PathVariable String cor){
            List<VeiculoMinDTO> result = veiculoService.findByCorIgnoreCase(cor);
            return result;
    }

    //precisa do minDTO
    @GetMapping("/garagem/year/{ano}")
    public List<VeiculoMinDTO> findByCor(@PathVariable int ano){
            List<VeiculoMinDTO> result = veiculoService.findByAno(ano);
            return result;    
    }
    
}
