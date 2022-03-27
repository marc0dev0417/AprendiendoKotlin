package com.marcodev.crud_psp.Exception;

public class TareaNoEncontradaException extends RuntimeException{
    private String nombreRecurso;
    private String nombreCampo;
    private Object valor;

    public TareaNoEncontradaException(String nombreRecurso, String nombreCampo, Object valor) {
        super(String.format("Recurso %s no encontrado. Campo %s: '%s'", nombreRecurso, nombreCampo, valor));
        this.nombreRecurso = nombreRecurso;
        this.nombreCampo = nombreCampo;
        this.valor = valor;
    }

    public String getNombreRecurso() {
        return nombreRecurso;
    }

    public String getNombreCampo() {
        return nombreCampo;
    }

    public Object getValor() {
        return valor;
    }
}
