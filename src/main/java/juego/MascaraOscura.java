package juego;

public class MascaraOscura extends Artefacto implements Calculable {
    private int nivelDeOscuridad;

    public MascaraOscura(int nivelDeOscuridad) {

        this.nivelDeOscuridad = nivelDeOscuridad;
    }

    @Override
    public int getUnidadesDeLucha() {

        return 2 * nivelDeOscuridad;
    }

    @Override
    public int calcularNivelDeLucha() {

        return 2 * nivelDeOscuridad;
    }
}

