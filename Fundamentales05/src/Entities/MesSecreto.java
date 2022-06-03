/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author tomasnuin
 */
public class MesSecreto {

    private final String[] meses;
    private final String  mesSecreto;

    public MesSecreto() {
        meses = new String[12];
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";
        
        mesSecreto = meses[ (int)Math.floor(Math.random()*(12)) ];
        // System.out.println(mesSecreto);
    }

    public String getMesSecreto() {
        return mesSecreto;
    }
    
    
}
