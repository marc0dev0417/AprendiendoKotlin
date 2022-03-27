package com.marcodev.crud_psp.Controller;

import com.marcodev.crud_psp.Exception.TareaNoEncontradaException;
import com.marcodev.crud_psp.model.Tarea;
import com.marcodev.crud_psp.repository.TareaRepositorio;
import com.marcodev.crud_psp.service.ServicioInterfaz;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
public class Controller {

    private ServicioInterfaz servicio;
    private TareaRepositorio tareaRepositorio;

    public Controller(ServicioInterfaz servicio, TareaRepositorio tareaRepositorio){
        super();
        this.servicio = servicio;
        this.tareaRepositorio = tareaRepositorio;
    }
    @GetMapping("/tareas")
   public List<Tarea> listaTareas(){
        return servicio.listaTarea();
    }
    @GetMapping("/tareas/{id}")
    public ResponseEntity<Tarea> encontrarById(@PathVariable int id){
        return servicio.tareaById(id);
    }
    @GetMapping("/tareas/nombre")
   public List<String> listaNombresTareas(){
        return servicio.tareaNombre();
   }
   @GetMapping("/tareas/idNombre")
    public List<String> listaidNombreTarea(){
        return servicio.listaNombreId();
   }
   //Post para meter en la base de datos la tarea =>
    @PostMapping("/tareas/insertar")
    public void insertarTarea(@RequestBody Tarea tarea){
        servicio.guardarTarea(tarea);
    }
    //Modificar Tarea =>
    @PutMapping("/tareas/actualizar")
    public void modificar(@RequestBody Tarea tarea){
        servicio.editar(tarea);
    }
    //Eliminar Tarea =>
    @DeleteMapping("/tareas/eliminar/{id}")
    public void eliminar(@PathVariable int id){
            servicio.eliminar(id);
    }
    @ExceptionHandler(TareaNoEncontradaException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> controllerElementException(TareaNoEncontradaException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
}
