package test;

import model.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testar_somar(){
        Calculadora calculadora = new Calculadora();
        Assertions.assertEquals(10, calculadora.somar(5 ,5));

    }
}
