package com.marcodev.crud_psp.service;

import com.marcodev.crud_psp.model.Tarea;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ServicioInterfaz {

    public List<Tarea> listaTarea();
    public List<String> tareaNombre();
    public List<String> listaNombreId();
    public void guardarTarea(Tarea tarea);
    public void editar(Tarea tarea);
    public void eliminar(int id);
    public ResponseEntity<Tarea> tareaById(int id);
}
