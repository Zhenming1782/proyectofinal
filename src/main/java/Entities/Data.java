package Entities;

import java.awt.*;
import java.util.ArrayList;

public class Data {
    public static ArrayList<FormValue> tablas = new ArrayList<>();

    public static void fillList(){

        ArrayList<Form> formValue1 = new ArrayList<>();
        formValue1.add(new Form("Test Persona 1", "String", true, false, true, true));
        formValue1.add(new Form("Test Persona 2", "Integer", true, true, true, false));
        formValue1.add(new Form("Test Persona 3", "Double", true, false, false, false));
        tablas.add(new FormValue("Persona", formValue1));

        ArrayList<Form> formValue2 = new ArrayList<>();
        formValue2.add(new Form("Test Animal 1", "String", true, false, true, true));
        formValue2.add(new Form("Test Animal 2", "Integer", false, true, true, false));
        formValue2.add(new Form("Test Animal 3", "Boolean", true, false, false, false));
        tablas.add(new FormValue("Animal", formValue2));

        ArrayList<Form> formValue3 = new ArrayList<>();
        formValue3.add(new Form("Test Producto 1", "Boolean", true, false, true, true));
        formValue3.add(new Form("Test Producto 2", "Integer", false, true, true, false));
        formValue3.add(new Form("Test Producto 3", "String", true, false, false, false));
        tablas.add(new FormValue("Producto", formValue3));
    }

    public static ArrayList<String> obtenerAtributos() {
        ArrayList<String> tipoAtributos = new ArrayList<>();
        tipoAtributos.add("String");
        tipoAtributos.add("Integer");
        tipoAtributos.add("Boolean");
        tipoAtributos.add("Double");
        tipoAtributos.add("Date");
        tipoAtributos.add("Enum");

        return tipoAtributos;
    }
}
