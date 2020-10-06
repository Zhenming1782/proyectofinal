package Entities;

public class Form {
    public String nombre;
    public String tipoAtributo;
    public boolean pkCheckcbox;
    public boolean notNullCheckbox;
    public boolean fkCheckbox;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAtributo() {
        return tipoAtributo;
    }

    public void setTipoAtributo(String tipoAtributo) {
        this.tipoAtributo = tipoAtributo;
    }

    public boolean isPkCheckcbox() {
        return pkCheckcbox;
    }

    public void setPkCheckcbox(boolean pkCheckcbox) {
        this.pkCheckcbox = pkCheckcbox;
    }

    public boolean isNotNullCheckbox() {
        return notNullCheckbox;
    }

    public void setNotNullCheckbox(boolean notNullCheckbox) {
        this.notNullCheckbox = notNullCheckbox;
    }

    public boolean isFkCheckbox() {
        return fkCheckbox;
    }

    public void setFkCheckbox(boolean fkCheckbox) {
        this.fkCheckbox = fkCheckbox;
    }
}
