package com.marcodev.crud_psp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name = "dia_semana", nullable = false)
    private String dia;
}
