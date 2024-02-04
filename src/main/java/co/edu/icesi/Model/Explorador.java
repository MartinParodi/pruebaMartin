package co.edu.icesi.Model;

import java.util.ArrayList;

public class Explorador {
    // ------------------------------------
    // Atributos
    // ------------------------------------
    private Directorio dirActual;
    private ArrayList subdirectorios;
    private ArrayList archivos;
    public Explorador( ){
        dirActual = new Directorio( );
        actualizarInformacion( );
            
    }
}
