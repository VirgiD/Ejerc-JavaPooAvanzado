package juego;

public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero();

        Espada espada = new Espada(5);
        CollarDivino collar = new CollarDivino(10);
        MascaraOscura mascara = new MascaraOscura(3);

        guerrero.agregarArtefacto(espada);
        guerrero.agregarArtefacto(collar);
        guerrero.agregarArtefacto(mascara);

        // Debería imprimir 16 (5 + 10 + 6)
        System.out.println("Nivel de lucha del guerrero: " + guerrero.getNivelDeLucha());

        Armadura armadura = new Armadura(8);
        guerrero.agregarArtefacto(armadura);

        // Debería imprimir 20 (5 + 10 + 6 + 8/2)
        System.out.println("Nivel de lucha del guerrero con armadura: " + guerrero.getNivelDeLucha());
    }
}
