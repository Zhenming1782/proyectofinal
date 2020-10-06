package com.proyecto;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@ApplicationScoped
@Path("api")
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

//    @POST
//    @Path("/form")
//    public String CrearTable(){
//
//    }
}
