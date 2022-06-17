/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales08;

import Entities.Cadena;
import java.util.Scanner;

/**
 * 8. Realizar una clase llamada Cadena que tenga como atributos una frase (de
 * tipo de String) y su longitud. En el main se creará el objeto y se le pedirá
 * al usuario que ingrese una frase que puede ser una palabra o varias palabras
 * separadas por un espacio en blanco y a través de los métodos set, se guardará
 * la frase y la longitud de manera automática según la longitud de la frase
 * ingresada. Deberá además implementar los siguientes métodos:
 *
 * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
 * tiene la frase ingresada.
 *
 * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por
 * pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
 *
 * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el
 * usuario y contabilizar cuántas veces se repite el carácter en la frase, por
 * ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
 * veces.
 *
 * d) Método compararLongitud(String frase), deberá comparar la longitud de la
 * frase que compone la clase con otra nueva frase ingresada por el usuario.
 *
 * e) Método unirFrases(String frase), deberá unir la frase contenida en la
 * clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase
 * resultante.
 *
 * f) Método reemplazar(String letra), deberá reemplazar todas las letras “a”
 * que se encuentren en la frase, por algún otro carácter seleccionado por el
 * usuario y mostrar la frase resultante.
 *
 * g) Método contiene(String letra), deberá comprobar si la frase contiene una
 * letra que ingresa el usuario y devuelve verdadero si la contiene y falso si
 * no.
 */
public class Fundamentales08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        Cadena cad = new Cadena();
        String auxLetra;

        while (continuar) {
            System.out.println(""
                    + "         Menú: \n"
                    + " 1) Ingresar/reemplazar frase. \n"
                    + " 2) Mostrar vocales.\n"
                    + " 3) Cuantas veces se repite una letra.\n"
                    + " 4) Reemplazar letra.\n"
                    + " 5) Evaluar si contiene una letra.\n"
                    + " 6) Unir frase con otra frase.\n"
                    + " 7) Invertir frase.\n"
                    + " 8) Salir.\n"
                    + " Ingrese una opción.");

            switch (leer.nextInt()) {
                case 1:
                    System.out.println(""
                            + "Ingrese una frase. \n"
                            + "Si ya ha ingresado una frase esta sera reemplazada.\n"
                            + "Si no desea reemplazar la frase ingrese \"\"");
                    cad.setFrase();
                    break;
                case 2:
                    cad.mostrarVocales();
                    break;
                case 3:
                    System.out.println("Ingrese una letra.\n"
                            + "el programa buscará cuantas veces se repite en la frase.");
                    cad.vecesRepetido(leer.next());
                    break;
                case 4:
                    System.out.println("Ingrese una letra.\n"
                            + "el programa reemplazara todas las \"a\" por la letra indicada.");
                    cad.reemplazar(leer.next());
                    break;
                case 5:
                    System.out.println("Ingrese una letra.\n"
                            + "El programa indicara si la frase contiene esa letra o no.");
                    auxLetra = leer.next();
                    if (cad.contiene(auxLetra)) {
                        System.out.println("Contiene '" + auxLetra.charAt(0) + "'.");
                    } else {
                        System.out.println("No contiene '" + auxLetra.charAt(0) + "'.");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese una frase, esta se concatenara al final de la frase original.");
                    cad = cad.unirFrases(leer.nextLine());
                    break;
                case 7:
                    cad.invertirFrase();
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                default:
                    throw new AssertionError();
            }

            if (continuar) {
                System.out.println("Presione enter para continuar.");
                leer.nextLine();
                leer.nextLine();
            }
        }

    }

}
