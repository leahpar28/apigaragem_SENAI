package br.gm.raphael.apigaragem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author digma
 */

//AQUI EU CRIO A CLASSE(TABELA) VEÍCULO, COM SEUS ATRIBUTOS

//opa, essa classe é uma tabela, fica esperto
@Entity
//ESSE É O NOME QUE TENHO QUE COLOCAR NO H2-CONSOLE (VEICULO)
@Table(name = "veiculos")
public class Veiculo {
    
    //Agora é a parte da criação das colunas
    
    @Id 
    
    //Essa linha cria os Id's junto com as linhas, e incrementa automaticamente a contagem delas.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano; //estou com duvida
    private int km;
    
    @Column (name = "LINKIMAGEM")
    private String linkImagem;
   
    @Column (name = "DESCRICAOCOMPLETA")
    private String descricaoCompleta;
    
    private String avarias;
    
    //PRECISO CRIAR OS GETTERS AND SETTERS AQUI

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public void setLinkImagem(String linkImagem) {
        this.linkImagem = linkImagem;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

    public String getAvarias() {
        return avarias;
    }

    public void setAvarias(String avarias) {
        this.avarias = avarias;
    }

       
}
