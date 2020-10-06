package com.proyecto;

import Entities.Form;
import Entities.FormValue;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.api.ResourcePath;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class homepage {
    @Inject
    Template homepage;
    @Inject
    Template Form;

    @GET
    public TemplateInstance Homepage (){
        return homepage.data("title", "API Creation");

    }
    @GET
    @Path("/form")
    public TemplateInstance TableCreation(){
        return Form.data("title", "Table Creation");
    }

    @POST
    @Path("/form")
    public boolean CrearTable(FormValue formValue){
        if (formValue != null) {
            System.out.println(formValue.getNombreTabla());
            for (Form form: formValue.getFilas()) {
                System.out.println("nombre " + form.getNombre() + " -- tipo " + form.getTipoAtributo() + " -- pkchekbox "+ form.getFkCheckbox()
                                + " -- not null " + form.getNotNullCheckbox() + "-- fk " + form.getFkCheckbox());
            }
        }
        return true;
    }
}
