package ec.edu.epn.git.practica6;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator c;
    @Before
    public void setCalculatior(){
        c=new Calculator();
    }


    @Test
    public  void dado_dos_enteros_cuando_la_suma_ok(){
        assertEquals(6, c.addition(3,3));
    }

    private Calculator setCalculator() {
        return new Calculator();
    }

    @Test
    public void dado_dos_enteros_restar(){
        assertEquals(6,c.subtraction(10,4));
    }
    @Test
    public void dado_dos_enteros_dividir_entonces_excepcion(){
        assertEquals(3,c.division(3,1));
    }
    @Test
    public void dado_dos_enteros_multiplicar(){
        assertEquals(6,c.multiplication(3,2));
    }
}
