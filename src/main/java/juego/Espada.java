package juego;

public class Espada extends Artefacto implements Calculable{
    private int unidadesDeLucha;

    public Espada(int unidadesDeLucha) {

        this.unidadesDeLucha = unidadesDeLucha;
    }

    @Override
    public int getUnidadesDeLucha() {

        return unidadesDeLucha;
    }

    @Override
    public int calcularNivelDeLucha() {

        return unidadesDeLucha;
    }

}
