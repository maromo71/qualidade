import model.CarrinhoDeCompras;
import model.MaiorEMenor;
import model.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaiorEMenorTest {

    @Test
    public void EmOrdemDecrescente(){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Geladeira", 12));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

        MaiorEMenor algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);
        Assertions.assertEquals("Geladeira",
                algoritmo.getMenor().getNome());
        Assertions.assertEquals("Liquidificador",
                algoritmo.getMaior().getNome());
    }
}