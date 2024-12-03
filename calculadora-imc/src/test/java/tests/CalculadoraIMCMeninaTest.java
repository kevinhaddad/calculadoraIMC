package tests;

import controler.CalculadoraIMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraIMCMeninaTest {

    CalculadoraIMC calculadoraImc;

    @Before
    public void setup(){
        calculadoraImc = new CalculadoraIMC();
    }

    /*
        **INTERVALO DE VALORES INFANTIL FEMININO**
        - Baixo peso: Abaixo de 14,8:
        - Peso normal: Entre 14,8 e 18,0:
        - Sobrepeso: Entre 18,0 e 19,2:
        - Obesidade: Acima de 19,2:
    */

    // IDADE = 2
    @Test
    public void testeBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(10, 1.0, 2, "f"));//10

    }
    @Test
    public void testePesoNormal2() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(15, 1.0, 2, "f"));//15

    }

    @Test
    public void testeSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(19, 1.0, 2, "f"));//19

    }

    @Test
    public void testeObesidade2() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(20, 1.0, 2, "f"));//20

    }


    //IDADE = 4
    @Test
    public void testeBaixoPeso4() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(12, 1.1, 4, "f"));//9,92

    }

    @Test
    public void testePesoNormal4() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(19, 1.1, 4, "f"));//15,70

    }

    @Test
    public void testeSobrepeso4() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(22, 1.1, 4, "f"));//19,83

    }

    @Test
    public void testeObesidade4() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(26, 1.1, 4, "f"));//19,83

    }


    //IDADE = 6

    @Test
    public void testeBaixoPeso6() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(14, 1.2, 6, "f"));//9,72

    }

    @Test
    public void testePesoNormal6() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(24, 1.2, 6, "f"));//16,67

    }

    @Test
    public void testeSobrepeso6() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(26, 1.2, 6, "f"));//18,06

    }

    @Test
    public void testeObesidade6() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(30, 1.2, 6, "f"));//20,83

    }

    //IDADE = 8

    @Test
    public void testeBaixoPeso8() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(16, 1.3, 8, "f"));//9,47

    }

    @Test
    public void testePesoNormal8() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(26, 1.3, 8, "f"));//15,38

    }

    @Test
    public void testeSobrepeso8() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(33, 1.3, 8, "f"));//18,93

    }

    @Test
    public void testeObesidade8() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(40, 1.3, 8, "f"));//23,67

    }

    //IDADE = 10

    @Test
    public void testeBaixoPeso10() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(18, 1.4, 10, "f"));//9,18

    }

    @Test
    public void testePesoNormal10() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(30, 1.4, 10, "f"));//15,31

    }

    @Test
    public void testeSobrepeso10() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(41, 1.4, 10, "f"));//18,88

    }

    @Test
    public void testeObesidade10() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(50, 1.4, 10, "f"));//25,51

    }

    //IDADE = 12

    @Test
    public void testeBaixoPeso12() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(20, 1.5, 12, "f"));//8,89

    }

    @Test
    public void testePesoNormal12() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(40, 1.5, 12, "f"));//15,56

    }

    @Test
    public void testeSobrepeso12() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(49, 1.5, 12, "f"));//19,11

    }

    @Test
    public void testeObesidade12() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(60, 1.5, 12, "f"));//26,67

    }
}