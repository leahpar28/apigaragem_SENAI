/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.gm.raphael.apigaragem.repositories;

import br.gm.raphael.apigaragem.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digma
 */

//O nome que etá dentro dos <> (Veículo) é o nome da classe que eu defini como tabela 
//Parte que está no ...entities/Veiculo.java
public interface veiculoRepositories extends JpaRepository<Veiculo, Long> {
   
    
   List<Veiculo> findById(long id); //fui no pacote entities e peguei o id (Prestar atenção em como o atributo está escrito)
   
   List<Veiculo> findByCorIgnoreCase(String cor);
   
   List<Veiculo> findByAno (int ano);
}
