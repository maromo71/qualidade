package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MaiorEMenorTest {

    @Test
    public void ordemDescrescente(){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));
        
        MaiorEMenor algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);
        Assertions.assertEquals("Jogo de pratos",
                algoritmo.getMenor().getNome());
        Assertions.assertEquals("Geladeira",
                algoritmo.getMaior().getNome());
    }



}