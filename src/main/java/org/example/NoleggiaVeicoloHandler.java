package org.example;

import java.util.ArrayList;

public class NoleggiaVeicoloHandler {

    public void visualizzaListaVeicoli(double lat, double lng, double raggio, Citta citta, Cittadino cittadino){
        cittadino.setPosizione(lat,lng);
        ArrayList<Stallo> stalli = citta.getStalli();
    }

    public void prenotaVeicolo(Veicolo veicolo, Stallo stallo, Cittadino cittadino){

    }
}
