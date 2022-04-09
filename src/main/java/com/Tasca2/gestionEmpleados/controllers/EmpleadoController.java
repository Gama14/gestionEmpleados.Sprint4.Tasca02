package com.Tasca2.gestionEmpleados.controllers;

import com.Tasca2.gestionEmpleados.DAO.EmpleadoDAO;
import com.Tasca2.gestionEmpleados.models.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoDAO empleadoDAO;


    @RequestMapping(value = "empleados", method = RequestMethod.GET)
    public List<Empleado> getEmpleados() {
        return empleadoDAO.getEmpleados();
    }

    @RequestMapping(value = "crearEmpleado")
    public String crearEmpleado(@PathVariable Long id) {
        return "empleados";
    }


    @RequestMapping(value = "updateEmpleado{id}")
    public Empleado updateEmpleado(@PathVariable Long id) {
        Empleado prueba = new Empleado();
        prueba.setId(23L);
        prueba.setNombre("sara");
        prueba.setApellido("garcia");
        prueba.setCargo("pepe@pepe");
        prueba.setSalario("welovepepe");

        return prueba;
    }
   /* @RequestMapping(value = "listaEmpleados{id}", method = RequestMethod.DELETE)
    public void deleteEmpleado(@PathVariable Long id) {
       empleadoDAO.eliminar(id);
    }*/



}
