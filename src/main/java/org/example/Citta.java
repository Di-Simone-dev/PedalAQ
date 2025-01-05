package org.example;

import java.util.ArrayList;

public class Citta {
    private String nome;
    private double lat;
    private double lng;
    private ArrayList<Stallo> stalli;
    private TariffaNoleggio tariffaNoleggioAttiva;

    public ArrayList<Stallo> getStalli(){
        return this.stalli;
    }
}
