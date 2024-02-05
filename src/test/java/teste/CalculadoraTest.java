/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teste;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jackson
 */
public class CalculadoraTest {
    
    /*public CalculadoraTest() {
    }*/

    @Test
    public void testSomar() {
        int a = 6;
        int b = 3;
        int esperado = 9;
        int obtido = Calculadora.Somar(a,b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testNomes() {
        String nome = "Developer";
        String esperado = "Developer";
        String obtido = Calculadora.Nomes(nome);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testDivisao() {
        int a = 6;
        int b = 3;
        int esperado = 2;
        int obtido = Calculadora.Divisao(a,b);
        assertEquals(esperado, obtido);
    }
    
    
}
