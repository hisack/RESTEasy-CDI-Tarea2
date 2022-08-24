package com.programacion.rest;

import com.programacion.db.Album;
import com.programacion.db.Singer;
import com.programacion.servicios.ServicioAlbum;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/album")
@ApplicationScoped
public class RestAlbum {

    @Inject
    private ServicioAlbum servicioAlbum;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Album> albumfindAll() {

        List<Album> album = servicioAlbum.albumfindAll();
/*
        if (!album.isEmpty()) {
            return Response.status(Response.Status.OK).entity(album).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }*/

        return album;
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Album albumfindById(@PathParam("id") Integer id) {

        Album album = servicioAlbum.albumfindById(id);
/*
        if (album.getId() != null) {
            return Response.status(Response.Status.OK).entity(album).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }*/

        return album;
    }


    @POST
    @Path("/insert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Album createAlbum(Album a) {
        boolean result = servicioAlbum.createAlbum(a);

        /*
        if (result) {
            return Response.status(Response.Status.CREATED).entity(a).build();
        } else {
            return Response.notModified().build();
        }*/

        return a;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAlbum(@PathParam("id") Integer id, Album album){
        servicioAlbum.updateAlbum(id, album);
        return Response.status(Response.Status.OK).entity(album).build();
    }

    @Path("/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAlbum(@PathParam("id") Integer id) {
        boolean result = servicioAlbum.deleteAlbum(id);

        if (result) {
            return Response.status(200).entity("Fila Borrada").build();
        } else {
            return Response.notModified().build();
        }
    }
}
