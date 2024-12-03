package tests;
import controler.CalculadoraIMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraIMCIdosos {

    CalculadoraIMC calculadoraImc;

    @Before
    public void setup() {
        calculadoraImc = new CalculadoraIMC();
    }

    //Idosas mulheres
    @Test
    public void testBaixoPeso() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(50, 1.60, 70, "f"));
    }

    @Test
    public void testPesoNormalMinimoIdosoFeminino() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(57, 1.60, 70, "f"));
    }

    @Test
    public void testPesoNormalMaximoIdosoFeminino() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(69.12, 1.60, 70, "f"));
    }

    @Test
    public void testSobrepesoMinimoIdosoFeminino() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(69.60, 1.60, 70, "f"));
    }

    @Test
    public void testSobrepesoMaximoIdosoFeminino() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(81.92, 1.60, 70, "f"));
    }

    @Test
    public void testObesidadeGrauIMinimoIdosoFeminino() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(82.40, 1.60, 70, "f"));
    }

    @Test
    public void testObesidadeGrauIMaximoIdosoFeminino() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(94.72, 1.60, 70, "f"));
    }

    @Test
    public void testObesidadeGrauIIMinimoIdosoFeminino() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(95.20, 1.60, 70, "f"));
    }

    @Test
    public void testObesidadeGrauIIMaximoIdosoFeminino() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(106, 1.60, 70, "f"));
    }

    @Test
    public void testObesidadeGrauIIIdosoFeminino() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(110, 1.60, 70, "f"));
    }

    //idosos homens

    @Test
    public void testBaixoPesoIdosoMasculino() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(60, 1.70, 70, "m"));
    }

    @Test
    public void testPesoNormalMinimoIdosoMasculino() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(63.6, 1.70, 70, "m"));
    }

    @Test
    public void testPesoNormalMaximoIdosoMasculino() {
        Assert.assertEquals("Peso normal", calculadoraImc.calcularImc(76, 1.70, 70, "m"));
    }

    @Test
    public void testSobrepesoMinimoIdosoMasculino() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(78.6, 1.70, 70, "m"));
    }

    @Test
    public void testSobrepesoMaximoIdosoMasculino() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(86, 1.70, 70, "m"));
    }

    @Test
    public void testObesidadeGrauIMinimoIdosoMasculino() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(85, 1.68, 70, "m"));
    }

    @Test
    public void testObesidadeGrauIMaximoIdosoMasculino() {
        Assert.assertEquals("Obesidade grau I", calculadoraImc.calcularImc(101.1, 1.70, 70, "m"));
    }

    @Test
    public void testObesidadeGrauIIMinimoIdosoMasculino() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(102, 1.70, 70, "m"));
    }

    @Test
    public void testObesidadeGrauIIMaximoIdosoMasculino() {
        Assert.assertEquals("Obesidade grau II", calculadoraImc.calcularImc(115.2, 1.70, 70, "m"));
    }

    @Test
    public void testObesidadeGrauIIIMorbidHomemIdoso() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calculadoraImc.calcularImc(120, 1.70, 70, "m"));
    }
}
