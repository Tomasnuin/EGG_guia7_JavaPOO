/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentales07;

import Entities.Persona;
import Services.PersonaService;

/**
 * 7. Realizar una clase llamada Persona que tenga los siguientes atributos:
 * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el
 * alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se
 * implementarán son:
 *
 * • Un constructor por defecto.
 *
 * • Un constructor con todos los atributos como parámetro.
 *
 * • Métodos getters y setters de cada atributo.
 *
 * • Método crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *
 * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.
 *
 * A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad.
 *
 * Por último, guardaremos los resultados de los métodos calcularIMC y
 * esMayorDeEdad en distintas variables, para después en el main, calcular un
 * porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en
 * su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
 * cuantos son mayores de edad y cuantos menores.
 */
/**
 * Mis notas. En lugar de hacerlo de esta forma, yo usaría un arreglo de Persona
 * y despues usaría las funciones en cada elemento del arreglo, asignando los
 * resultados a otros arreglos y con esa información presento los resultados,
 * pero lo voy a hacer de la forma en la que me indica el ejercicio.
 */
public class Fundamentales07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaService pService = new PersonaService();

        Persona p1 = pService.crearPersona();
        Persona p2 = pService.crearPersona();
        Persona p3 = pService.crearPersona();
        Persona p4 = pService.crearPersona();

        /* Cada una de estas variables suma 0 ó 1 dependiendo de el resultado de
        la función, asi podemos saber cuantas personas tienen 
        sobrepeso/bajo peso/peso ideal.
        */
        
        int sobrepesoTotal = calcularSobrePeso(pService, p1) + calcularSobrePeso(pService, p2)
                + calcularSobrePeso(pService, p3) + calcularSobrePeso(pService, p4);

        int pesoIdealTotal = calcularPesoIdeal(pService, p1) + calcularPesoIdeal(pService, p2)
                + calcularPesoIdeal(pService, p3) + calcularPesoIdeal(pService, p4);

        int bajoPesoTotal = calcularBajoPeso(pService, p1) + calcularBajoPeso(pService, p2)
                + calcularBajoPeso(pService, p3) + calcularBajoPeso(pService, p4);

        System.out.println("El " + ((sobrepesoTotal * 100) / 4) + "% del grupo tiene sobrepeso.");
        System.out.println("El " + ((pesoIdealTotal * 100) / 4) + "% del grupo tiene peso ideal.");
        System.out.println("El " + ((bajoPesoTotal * 100) / 4) + "% del grupo tiene peso bajo.");

        /* La funcion esMayorDeEdad devuelve 0 ó 1, por lo tanto la suma es igual
         a cuantas personas son mayores de edad.
        */
        int menoresTotal = esMayorDeEdad(pService, p1) + esMayorDeEdad(pService, p2)
                + esMayorDeEdad(pService, p3) + esMayorDeEdad(pService, p4);
        
        int mayoresTotal = esMenorDeEdad(pService, p1) + esMenorDeEdad(pService, p2)
                + esMenorDeEdad(pService, p3) + esMenorDeEdad(pService, p4);

        System.out.println("El " + ((mayoresTotal * 100) / 4) + "% del grupo es mayor de edad.");
        System.out.println("El " + ((menoresTotal * 100) / 4) + "% del grupo es menor de edad.");

    }

    public static int calcularBajoPeso(PersonaService ps, Persona p) {
        if (ps.calcularIMC(p) == -1) {
            System.out.println(p.getNombre() + " tiene peso bajo.");
            return 1;
        }
        return 0;
    }

    public static int calcularSobrePeso(PersonaService ps, Persona p) {
        if (ps.calcularIMC(p) == 1) {
            System.out.println(p.getNombre() + " tiene sobrepeso.");
            return 1;
        }
        return 0;
    }

    public static int calcularPesoIdeal(PersonaService ps, Persona p) {
        if (ps.calcularIMC(p) == 0) {
            System.out.println(p.getNombre() + " tiene peso ideal.");
            return 1;
        }
        return 0;
    }

    public static int esMayorDeEdad(PersonaService ps, Persona p) {
        if (ps.esMayorDeEdad(p)) {
            System.out.println(p.getNombre() + " es mayor de edad.");
            return 1;
        }

        return 0;
    }

    public static int esMenorDeEdad(PersonaService ps, Persona p) {
        if (!ps.esMayorDeEdad(p)) {
            System.out.println(p.getNombre() + " es menor de edad.");
            return 1;
        }

        return 0;
    }
}
