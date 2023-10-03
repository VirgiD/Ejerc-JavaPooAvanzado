package juego;

public class CollarDivino extends Artefacto  implements Calculable{
    private int perlas;

    public CollarDivino(int perlas) {

        this.perlas = perlas;
    }

    @Override
    public int getUnidadesDeLucha() {

        return perlas;
    }

    @Override
    public int calcularNivelDeLucha() {

        return perlas;
    }
}

