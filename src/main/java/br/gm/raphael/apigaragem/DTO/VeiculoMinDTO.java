/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.raphael.apigaragem.DTO;
import br.gm.raphael.apigaragem.entities.Veiculo;
import jakarta.persistence.Column;

/**
 *
 * @author digma
 */
public class VeiculoMinDTO {
   
    private String marca; //ok
    private String modelo; //ok
    private String cor;//ok
    private int ano; //ok
    private int km; //ok
    private String linkImagem; //ok

    public VeiculoMinDTO(){
}
    public VeiculoMinDTO(Veiculo veiculo) {
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.ano = veiculo.getAno();
        this.km = veiculo.getKm();
        this.linkImagem = veiculo.getLinkImagem();       
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public int getKm() {
        return km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }
    
    
    
}
