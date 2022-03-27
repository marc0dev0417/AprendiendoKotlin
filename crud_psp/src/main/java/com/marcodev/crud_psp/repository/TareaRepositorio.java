package com.marcodev.crud_psp.repository;

import com.marcodev.crud_psp.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
    @Query("SELECT t FROM Tarea t")
    List<Tarea> todasTareas();

    @Query("SELECT t.nombre FROM Tarea t")
    List<String> nombreTareas();

    @Query("SELECT t.id, t.nombre FROM Tarea t")
    List<String>  idNombreTareas();


}
