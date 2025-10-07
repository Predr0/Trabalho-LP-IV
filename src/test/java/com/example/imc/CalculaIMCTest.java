import com.example.imc.Individuo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculaIMCTest {

    Individuo individuo;

    @BeforeEach
    void setUp() {
        individuo = new Individuo();
        individuo.setAltura(1.0f);
    }

    @Test
    void deveRetornarMasculinoAbaixoPeso() {
        individuo.setPeso(20.6f);
        individuo.setGenero("masculino");
        assertEquals("Abaixo do peso", individuo.definirStatusImc());
    }


    @Test
    void deveRetornarMasculinoPesoNormal() {
        individuo.setPeso(26.3f);
        individuo.setGenero("masculino");
        assertEquals("Peso normal", individuo.definirStatusImc());
    }


    @Test
    void deveVerificarPesoValido() {
        individuo.setPeso(0.1f);
        assertEquals(0.1f, individuo.getPeso());
    }

    @Test
    void deveVerificarPesoInvalido() {
        try {
            individuo.setPeso(0.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("peso invalido", e.getMessage());
        }
    }
}