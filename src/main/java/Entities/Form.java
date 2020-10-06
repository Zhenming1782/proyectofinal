package Entities;

public class Form {
    public String nombre;
    public String tipoAtributo;
    public String pkCheckcbox;
    public String notNullCheckbox;

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

    public String getPkCheckcbox() {
        return pkCheckcbox;
    }

    public void setPkCheckcbox(String pkCheckcbox) {
        this.pkCheckcbox = pkCheckcbox;
    }

    public String getNotNullCheckbox() {
        return notNullCheckbox;
    }

    public void setNotNullCheckbox(String notNullCheckbox) {
        this.notNullCheckbox = notNullCheckbox;
    }

    public String getFkCheckbox() {
        return fkCheckbox;
    }

    public void setFkCheckbox(String fkCheckbox) {
        this.fkCheckbox = fkCheckbox;
    }

    public String fkCheckbox;
}
