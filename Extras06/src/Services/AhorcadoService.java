/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author tomasnuin
 */
public class AhorcadoService {

    /**
     *
     * @return
     */
    public Ahorcado crearJuego() {
        Scanner r = new Scanner(System.in);
        Ahorcado ah = new Ahorcado();

        System.out.println("Ingrese la palabra secreta.");
        String p = r.nextLine().toLowerCase();
        System.out.println("Ingrese cantidad de intentos máximos.");
        int iMax = r.nextInt();

        char[] vp = new char[p.length()];

        for (int i = 0; i < p.length(); i++) {
            vp[i] = p.charAt(i);
        }

        ah.setPalabra(vp);
        ah.setJugadasMaximas(iMax);

        return ah;
    }

    /**
     *
     * @param ah
     * @return
     */
    public int longitud(Ahorcado ah) {
        return ah.getPalabra().length;
    }

    /**
     *
     * @param ah
     * @param l
     * @return
     */
    public int buscar(Ahorcado ah, char l) {
        int contador = 0;
        for (int i = 0; i < this.longitud(ah); i++) {
            if (ah.getPalabra()[i] == l && l != '-') {
                contador++;
                ah.getPalabra()[i] = '-';
            }
        }
        return contador;
    }

    /**
     *
     * @param ah
     * @param l
     * @return
     */
    public boolean encontradas(Ahorcado ah, char l) {
        int aux = this.buscar(ah, l);
        if (aux > 0) {
            ah.setEncontradas(ah.getEncontradas() + aux);
            return true;
        }
        return false;
    }

    /**
     *
     * @param ah
     * @return
     */
    public int intentos(Ahorcado ah) {
        return ah.getJugadasMaximas();
    }

    /**
     *
     * @param ahS
     */
    public void juego(AhorcadoService ahS) {
        Scanner r = new Scanner(System.in);
        char c;
        boolean continuar = true;
        Ahorcado ah = ahS.crearJuego();

        System.out.println("\n\n\n\n\n\n\n"
                + "     Ahorcado:\n"
                + "Descubre la palabra secreta antes de \n"
                + "que se terminen todos tus intentos");

        while (continuar) {

            System.out.println("------------------------------------------------");
            System.out.println("Longitud de la palabra: " + ahS.longitud(ah));
            System.out.println("Ingresa una letra");
            c = r.next().toLowerCase().charAt(0);

            if (ahS.encontradas(ah, c)) {

                System.out.println("La letra pertenece a la palabra.");
                System.out.println(ah.getPalabra());
            } else {
                System.out.println("La letra no pertenece a la palabra.");
                ah.setJugadasMaximas(ah.getJugadasMaximas() - 1);
            }
            System.out.println("Número de letras (encontradas, faltantes): ("
                    + ah.getEncontradas() + "," + (ahS.longitud(ah) - ah.getEncontradas()) + ")");
            System.out.println("Número de oportunidades restantes: " + ahS.intentos(ah));
            if (ah.getJugadasMaximas() == 0) {

                System.out.println("Se han agotado los intentos.");
                continuar = false;

            } else if (ah.getEncontradas() == ahS.longitud(ah)) {

                System.out.println("¡Ganaste!");
                continuar = false;

            }
        }

    }
}
