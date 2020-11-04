package Entities;

import java.util.ArrayList;

public class FormValue {
    public String nombreTabla;
    public boolean creado;
    public ArrayList<Form> filas;

    public String getNombreTabla() {
        return nombreTabla;
    }

    public FormValue(String nombreTabla, boolean creado, ArrayList<Form> filas) {
        this.nombreTabla = nombreTabla;
        this.creado = creado;
        this.filas = filas;
    }

    public boolean isCreado() {
        return creado;
    }

    public void setCreado(boolean creado) {
        this.creado = creado;
    }

    public FormValue() {
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
