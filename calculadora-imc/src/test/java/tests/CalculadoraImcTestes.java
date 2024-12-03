package tests;

import controler.CalculadoraIMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraIMC calcImc;

    @Before
    public void setup() {
        calcImc = new CalculadoraIMC();
    }

    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(48.0, 1.735, 20, "m"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveInferior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(48.0, 1.73, 20, "f"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveSuperior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(50.0, 1.72, 65, "m"));
    }

    @Test
    public void testeMenina4anosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(50.0, 1.6, 4, "f"));
    }

    @Test
    public void testeMenino6anosPesoNormal() {
        Assert.assertEquals("Peso Normal", calcImc.calcularImc(21.0, 1.2, 6, "m"));
    }

    // Teste 6: IMC infantil - Sobrepeso para um menino de 7 anos
    @Test
    public void testeMenino7anosSobrepeso() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(28.0, 1.2, 6, "m"));
    }

    // Teste 7: IMC adulto - Peso normal para um homem de 30 anos
    @Test
    public void testeAdulto30anosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(72.0, 1.8, 30, "m"));
    }

    // Teste 8: IMC adulto - Obesidade grau I para uma mulher de 40 anos
    @Test
    public void testeMulher40anosObesidadeGrauI() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(90.0, 1.65, 40, "f"));
    }

    // Teste 9: IMC idoso - Peso normal para um idoso homem de 70 anos
    @Test
    public void testeIdosoHomem70anosPesoNormal() {
        Assert.assertEquals("Peso normal", calcImc.calcularImc(72.0, 1.75, 70, "m"));
    }

    // Teste 10: IMC idoso - Obesidade grau II para uma idosa de 80 anos
    @Test
    public void testeIdosa80anosObesidadeGrauII() {
        Assert.assertEquals("Obesidade grau I", calcImc.calcularImc(85.0, 1.6, 80, "f"));
    }
}