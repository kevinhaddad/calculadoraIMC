package tests;

import controler.CalculadoraIMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.log;

public class CalculadoraIMCMeninoTest {

    CalculadoraIMC calculadoraImc;

    @Before
    public void setup(){
        calculadoraImc = new CalculadoraIMC();
    }

    // IDADE = 2
    @Test
    public void testeBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(10, 1.0, 2, "m")); //10

    }
    @Test
    public void testePesoNormal2() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(15, 1.0, 2, "m")); //15

    }

    @Test
    public void testeSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(19, 1.0, 2, "m")); //19

    }

    @Test
    public void testeObesidade2() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(30, 1.0, 2, "m")); //30

    }


    //IDADE = 4
    @Test
    public void testeBaixoPeso4() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(12, 1.1, 4, "m")); //9,92

    }

    @Test
    public void testePesoNormal4() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(19, 1.1, 4, "m")); //15,70

    }

    @Test
    public void testeSobrepeso4() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(21, 1.1, 4, "m")); //16,53

    }

    @Test
    public void testeObesidade4() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(35, 1.1, 4, "m")); // 28,93

    }


    //IDADE = 6

    @Test
    public void testeBaixoPeso6() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(14, 1.2, 6, "m")); // 9,72

    }

    @Test
    public void testePesoNormal6() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(21, 1.2, 6, "m")); // 15,97

    }

    @Test
    public void testeSobrepeso6() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(25, 1.2, 6, "m")); // 18,75

    }

    @Test
    public void testeObesidade6() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(29, 1.2, 6, "m")); //20,14

    }

    //IDADE = 8

    @Test
    public void testeBaixoPeso8() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(16, 1.3, 8, "m"));//9,47

    }

    @Test
    public void testePesoNormal8() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(26, 1.3, 8, "m"));//15,38

    }

    @Test
    public void testeSobrepeso8() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(32, 1.3, 8, "m"));//18,93

    }

    @Test
    public void testeObesidade8() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(45, 1.3, 8, "m"));//26,63

    }

    //IDADE = 10

    @Test
    public void testeBaixoPeso10() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(20, 1.5, 10, "m"));//8,89

    }

    @Test
    public void testePesoNormal10() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(35, 1.5, 10, "m"));//15,56

    }

    @Test
    public void testeSobrepeso10() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(45, 1.5, 10, "m"));//18,67

    }

    @Test
    public void testeObesidade10() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(50, 1.5, 10, "m"));//

    }

    //IDADE = 12

    @Test
    public void testeBaixoPeso12() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(25, 1.7, 12, "m"));//8,65

    }

    @Test
    public void testePesoNormal12() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(49, 1.7, 12, "m"));//15,57

    }

    @Test
    public void testeSobrepeso12() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(65, 1.7, 12, "m"));//18,69

    }

    @Test
    public void testeObesidade12() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(85, 1.7, 12, "m"));//19,03

    }

}