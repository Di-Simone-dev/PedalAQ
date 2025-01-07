package org.example;

import java.util.ArrayList;

public class Citta {
    private String nome;
    private double lat;
    private double lng;
    private ArrayList<Stallo> stalli;
    private TariffaNoleggio tariffaNoleggioAttiva;

    public ArrayList<Stallo> getStalli(){
        //temporaneo
        return this.stalli;
    }

    public Citta(){
        nome = "L'Aquila";
        lat = 42.3634408;
        lng = 13.3445664;
        //TODO decidere se applicare lo strategy pattern su TariffaNoleggio
    }
}
