package tests;
import controler.CalculadoraIMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraIMCAdultosTest {

    CalculadoraIMC calculadoraImc;

    @Before
    public void setup() {
        calculadoraImc = new CalculadoraIMC();
    }

    @Test
    public void testBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(48.0, 1.735, 20, "m"));
    }

    @Test
    public void testBaixoPesoGraveMinimo() {
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(48.0, 1.73, 20, "f"));
    }

    @Test
    public void testBaixoPesoGraveMaximo() {
        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(50.0, 1.72, 65, "m"));
    }

    @Test
    public void testBaixoPesoMinimo() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(50, 1.71, 40, "f"));
    }

    @Test
    public void testBaixoPesoMaximo() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(55, 1.73, 28, "m"));
    }

    @Test
    public void testPesoNormalMinimo() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(59, 1.75, 22, "f"));
    }

    @Test
    public void testPesoNormalMaximo() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(75, 1.75, 30, "m"));
    }

    @Test
    public void testSobrepesoMinimo() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(76, 1.74, 40, "f"));
    }

    @Test
    public void testSobrepesoMaximo() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(91, 1.75, 50, "m"));
    }

    @Test
    public void testObesidadeGrauIMinimo() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(92, 1.75, 55, "f"));
    }

    @Test
    public void testObesidadeGrauIMaximo() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(107, 1.75, 60, "m"));
    }

    @Test
    public void testObesidadeGrauIIMinimo() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(108, 1.75, 25, "f"));
    }

    @Test
    public void testObesidadeGrauIIMaximo() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(122, 1.75, 30, "m"));
    }

    @Test
    public void testObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(130, 1.75, 35, "f"));
    }
}
