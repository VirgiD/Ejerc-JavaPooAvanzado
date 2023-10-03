package juego;

public class Armadura extends Artefacto implements Calculable   {
    private int piezas;

    public Armadura(int piezas) {

        this.piezas = piezas;
    }

    @Override
    public int getUnidadesDeLucha() {

        return 10 + (piezas / 2);
    }

    @Override
    public int calcularNivelDeLucha() {

        return 10 + (piezas / 2);
    }
}




