package com.Tasca2.gestionEmpleados.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "empleados")
public class Empleado {
    @Id
    @Getter@Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;
    @Getter@Setter
    @Column (name = "nombre")
    private String nombre;
    @Getter@Setter
    @Column (name = "apellido")
    private String apellido;
    @Getter@Setter
    @Column (name = "cargo")
    private String cargo;
    @Getter@Setter
    @Column (name = "salario")
    private String salario;

}