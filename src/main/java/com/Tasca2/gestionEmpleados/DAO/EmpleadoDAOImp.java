package com.Tasca2.gestionEmpleados.DAO;

import com.Tasca2.gestionEmpleados.models.Empleado;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EmpleadoDAOImp implements EmpleadoDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getEmpleados() {

        String query = "FROM Empleado";
        List<Empleado>resultado= entityManager.createQuery(query).getResultList();

        return resultado;
    }


   @Override
    public void eliminar(Long id) {
        Empleado empleado = entityManager.find(Empleado.class, id);
        entityManager.remove(empleado);
    }
}
