package Entities;

import java.util.ArrayList;

public class FormValue {
    public String nombreTabla;
    public ArrayList<Form> filas;

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public ArrayList<Form> getFilas() {
        return filas;
    }

    public void setFilas(ArrayList<Form> filas) {
        this.filas = filas;
    }
}
