package com.example.capitallocator;

import java.util.HashMap;

/*
    * Class implements a HashMap which stores capitals.
    * Key field is the Region's name, value field is its Capital.
    * TYPO: <Tuscany, Florence>
 */
public class Mapper {
    private  HashMap<String, String> locations;

    public Mapper(){
        locations = new HashMap<>();
    }

    public void regionInject(){
        locations.put("Abruzzo", "L'aquila");
        locations.put("Basilicata", "Potenza");
        locations.put("Calabria", "Catanzaro");
        locations.put("Campania", "Napoli");
        locations.put("Emilia Romagna", "Bologna");
        locations.put("Friuli Venezia Giulia", "Trieste");
        locations.put("Lazio", "Roma");
        locations.put("Liguria", "Genova");
        locations.put("Lombardia", "Milano");
        locations.put("Marche", "Ancona");
        locations.put("Molise", "Campobasso");
        locations.put("Piemonte", "Torino");
        locations.put("Puglia", "Bari");
        locations.put("Sardegna", "Cagliari");
        locations.put("Sicilia", "Palermo");
        locations.put("Toscana", "Firenze");
        locations.put("Trentino Alto Adige", "Trento");
        locations.put("Umbria", "Perugia");
        locations.put("Valle d'Aosta", "Aosta");
        locations.put("Veneto", "Venezia");
    }

    public String seek(String key){
        return locations.get(key);
    }
    public boolean isInMap(String key){ return locations.containsKey(key); }
}
