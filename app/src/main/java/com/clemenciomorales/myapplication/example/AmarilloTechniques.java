package com.clemenciomorales.myapplication.example;

import java.util.ArrayList;
import java.util.List;

public class AmarilloTechniques {

    private static final String [] AMARILLO_TECHNIQUES = {"Voltereta hacia delante hombro derecho e izquierdo",
    "Voltereta hacia atras hombro derecho e izquierdo", "Caida hacia delante amortiguada",
            "Caida hacia atras amortiguada", "Caida amortiguada lateral",

            "Rodillazo directo", "Rodillazo circular", "Patada directa", "Patada circular",
    "Patada lateral", "Patada trasera directa", "Todas las patadas avanzando en paso que sustituye chasse"};

    public static List<Model> getTechniques() {
        final List<Model> techniquesList = new ArrayList<>();
        for (int i = 0; i < AMARILLO_TECHNIQUES.length; i++) {
            techniquesList.add(new Model(i, AMARILLO_TECHNIQUES[i]));
        }
        return techniquesList;
    }
}
