package juego;

import java.util.ArrayList;
import java.util.List;

public class Guerrero {
    private List<Calculable> artefactos;

    public Guerrero() {

        this.artefactos = new ArrayList<>();
    }

    public void agregarArtefacto(Calculable artefacto) {

        artefactos.add(artefacto);
    }

    public int getCantidadDeArtefactos() {

        return artefactos.size();
    }

    public int getNivelDeLucha() {
        int nivelDeLucha = 0;
        for (Calculable artefacto : artefactos) {
            nivelDeLucha += artefacto.calcularNivelDeLucha();
        }
        return nivelDeLucha;
    }
}

