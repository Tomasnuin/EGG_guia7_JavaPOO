/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Matematica;

/**
 *
 * @author tomasnuin
 */
public class MatematicaService {
    
    public Matematica CrearMatematica() {
        return new Matematica(
                Math.random() * (40 + 1) - 20,
                Math.random() * (40 + 1) - 20);
    }

    /**
     * Método devolverMayor() para retornar cuál de los dos atributos tiene el
     * mayor valor.
     *
     * @param m Tipo Matematica
     * @return El mayor entre m.n1 y m.n2
     */
    public double devolverMayor(Matematica m) {
        if (m.getN1() < m.getN2()) {
            return m.getN2();
        } else {
            return m.getN1();
        }
    }
    
    /**
     * Función auxiliar para usar en otras funciones.
     * @param m
     * @return 
     */
    private double devolverMenor(Matematica m) {
        if (m.getN1() > m.getN2()) {
            return m.getN2();
        } else {
            return m.getN1();
        }
    }
    
    public void calcularPotencia(Matematica m) {
        System.out.println(Math.round(
                devolverMayor(m)) + " elevado a "
                + Math.round(devolverMenor(m)) + " es "
                + Math.pow(Math.round(devolverMayor(m)), Math.round(devolverMenor(m))));
    }
    
    public void calculaRaiz(Matematica m) {
        System.out.println("La raíz cuadrada de " + Math.abs(devolverMenor(m))
                + " es " + Math.sqrt(Math.abs(devolverMenor(m))));
    }
}
