package com.Tasca2.gestionEmpleados.DAO;

import com.Tasca2.gestionEmpleados.models.Empleado;

import java.util.List;

public interface EmpleadoDAO {

    List<Empleado> getEmpleados();

    void eliminar(Long id);

    void registrarEmpleado(Empleado empleado);

    void updateEmpleado(Empleado empleado);

    List<Empleado> getEmpleadosPorCargo(String cargo);
}
