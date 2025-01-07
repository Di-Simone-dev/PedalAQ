package org.example;
import java.util.ArrayList;

public class Stallo {
    private double lat;
    private double lng;
    private int maxPosti;
    private boolean stato;
    private String descrizione;
    private ArrayList<Veicolo> veicoli;

    public ArrayList getVeicoli(){

        return this.veicoli;
    }

    public boolean controllaPresenza(Veicolo veicolo){
        //tmp
        return true;
    }
    public boolean bloccaVeicolo(Veicolo veicolo){
        //tmp
        return true;
    }
}
