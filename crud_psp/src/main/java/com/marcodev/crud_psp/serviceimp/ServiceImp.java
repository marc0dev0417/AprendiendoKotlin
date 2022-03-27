package com.marcodev.crud_psp.serviceimp;

import com.marcodev.crud_psp.Exception.TareaNoEncontradaException;
import com.marcodev.crud_psp.model.Tarea;
import com.marcodev.crud_psp.repository.TareaRepositorio;
import com.marcodev.crud_psp.service.ServicioInterfaz;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImp implements ServicioInterfaz {

    private TareaRepositorio tareaRepositorio;

    public ServiceImp(TareaRepositorio tareaRepositorio){
        this.tareaRepositorio = tareaRepositorio;
    }
    @Override
    public List<Tarea> listaTarea() {
        return tareaRepositorio.todasTareas();
    }

    @Override
    public List<String> tareaNombre() {
        return tareaRepositorio.nombreTareas();
    }

    @Override
    public List<String> listaNombreId() {
        return tareaRepositorio.idNombreTareas();
    }

    @Override
    public void guardarTarea(Tarea tarea) {
     if(!tareaRepositorio.existsById(tarea.getId())){
         tareaRepositorio.save(tarea);
     }else{
         throw new TareaNoEncontradaException("tarea", "tarea", tarea);
     }
    }

    @Override
    public void editar(Tarea tarea) {
        if(tareaRepositorio.existsById(tarea.getId())) {
            tareaRepositorio.save(tarea);
        }else{
            throw new TareaNoEncontradaException("tarea", "tarea", tarea);
        }
    }

    @Override
    public void eliminar(int id) {
        if(tareaRepositorio.existsById(id)){
            tareaRepositorio.deleteById(id);
        }else{
            throw new TareaNoEncontradaException("tarea", "id", id);
        }
    }

    @Override
    public ResponseEntity<Tarea> tareaById(int id) {
        if(tareaRepositorio.existsById(id)){
            return new ResponseEntity<Tarea>(tareaRepositorio.getById(id), HttpStatus.OK);
        }else{
            throw new TareaNoEncontradaException("tarea", "id", id);
        }
    }
}
