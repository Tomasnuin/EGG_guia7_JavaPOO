package Services;

import Entities.Persona;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tomasnuin
 */
public class PersonaService {

    public Persona crearPersona() {
        Scanner r = new Scanner(System.in);

        System.out.println("Inicializando nueva persona.");
        System.out.println("Ingrese el nombre de esta persona:");
        String n = r.nextLine();

        int dia, mes, anio;
        System.out.println("A continuacion ingrese una fecha: ");
        System.out.println("Dia: ");
        dia = r.nextInt();
        System.out.println("Mes:");
        mes = r.nextInt();
        System.out.println("Año:");
        anio = r.nextInt();
        Date d = new Date(anio - 1900, mes - 1, dia);

        return new Persona(n, d);
    }

    public int calcularEdad(Persona p) {
        Date d = new Date();

        if (d.getMonth() - p.getFechaNacimiento().getMonth() <= 0
                && d.getDay() - p.getFechaNacimiento().getDay() < 0) {
            
            return Math.abs((d.getYear() - p.getFechaNacimiento().getYear()) - 1);
        } else {
            
            return (d.getYear() - p.getFechaNacimiento().getYear());
        }
    }

    public void menorQue(Persona p, int edad) {
        
        if (calcularEdad(p) < edad) {
            System.out.println(p.getNombre() + " es menor que la fecha ingresada.");
        } else {
            System.out.println(p.getNombre() + " es mayor que la fecha ingresada.");
        }
    }
}
