package com.proyecto;

import Entities.Form;
import Entities.FormValue;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.api.ResourcePath;
import org.jboss.resteasy.plugins.server.servlet.HttpServletResponseWrapper;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@ApplicationScoped
@Path("api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class homepage {
    @Inject
    Template homepage;
    @Inject
    Template Form;
    @Inject
    Template ApplicationName;

    @GET
    public TemplateInstance Homepage (){
        return homepage.data("title", "API Creation");
    }

    @GET
    @Path("/create")
    public TemplateInstance CreateApp(){
        return ApplicationName.data("title", "Name of Application");
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public Response GetAppName (@FormParam("name") String name){
        System.out.println(name);
        // Crear Aplicacion con Nombre e Importar toda las libs necesaria con los cmd de Mvn
        return Response.ok().build();

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
            //Entity Name
            System.out.println(formValue.getNombreTabla());
            //Entity details
            for (Form form: formValue.getFilas()) {
                System.out.println("nombre " + form.getNombre() + " -- tipo " + form.getTipoAtributo() + " -- pkchekbox "+ form.isPkCheckcbox()
                                + " -- not null " + form.isNotNullCheckbox() + "-- fk " + form.isFkCheckbox());
            }
        }
        return true;
    }

    @POST
    @Path("/create-app")
    public boolean CreateAPP (FormValue formValue){
        //Recibe la ultima tabla y termina de Crear y Mover la APP.
        if (formValue != null) {
            //Entity Name
            System.out.println(formValue.getNombreTabla());
            //Entity details
            for (Form form: formValue.getFilas()) {
                System.out.println("nombre " + form.getNombre() + " -- tipo " + form.getTipoAtributo() + " -- pkchekbox "+ form.isPkCheckcbox()
                        + " -- not null " + form.isNotNullCheckbox() + "-- fk " + form.isFkCheckbox());
            }
        }
        return true;

    }
}
