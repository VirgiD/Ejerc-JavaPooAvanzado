package juego;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GuerreroTest {

        private Guerrero guerrero;

        @Before
        public void setUp() {
            guerrero = new Guerrero();
        }

        @Test
        public void testNivelDeLuchaSinArtefactos() {
            assertEquals(0, guerrero.getNivelDeLucha());
        }

        @Test
        public void testNivelDeLuchaConEspada() {
            Espada espada = new Espada(5);
            guerrero.agregarArtefacto(espada);
            assertEquals(5, guerrero.getNivelDeLucha());
        }

        @Test
        public void testNivelDeLuchaConCollarDivino() {
            CollarDivino collar = new CollarDivino(10);
            guerrero.agregarArtefacto(collar);
            assertEquals(10, guerrero.getNivelDeLucha());
        }

        @Test
        public void testNivelDeLuchaConMascaraOscura() {
            MascaraOscura mascara = new MascaraOscura(3);
            guerrero.agregarArtefacto(mascara);
            assertEquals(6, guerrero.getNivelDeLucha());
        }

        @Test
        public void testNivelDeLuchaConArmadura() {
            Armadura armadura = new Armadura(8);
            guerrero.agregarArtefacto(armadura);
            assertEquals(14, guerrero.getNivelDeLucha());
        }

        @Test
        public void testNivelDeLuchaConVariosArtefactos() {
            Espada espada = new Espada(5);
            CollarDivino collar = new CollarDivino(10);
            MascaraOscura mascara = new MascaraOscura(3);
            Armadura armadura = new Armadura(8);

            guerrero.agregarArtefacto(espada);
            guerrero.agregarArtefacto(collar);
            guerrero.agregarArtefacto(mascara);
            guerrero.agregarArtefacto(armadura);

            assertEquals(35, guerrero.getNivelDeLucha()); // 5 + 10 + 6 + 14
        }
    }


