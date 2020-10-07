package Entities;

import javax.ws.rs.FormParam;

public class AppName {

    @FormParam("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
