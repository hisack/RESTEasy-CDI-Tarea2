package com.programacion.servicios;

import com.programacion.db.Album;
import jdk.jfr.Name;

import java.util.List;

public interface ServicioAlbum {

    public List<Album> albumfindAll();

    public Album albumfindById(Integer id);

    public boolean createAlbum(Album album);

    public void updateAlbum(Integer id,Album album);

    public boolean deleteAlbum(Integer id);
}
