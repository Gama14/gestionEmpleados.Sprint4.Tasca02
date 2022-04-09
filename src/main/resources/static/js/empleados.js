// Call the dataTables jQuery plugin
$(document).ready(function() {
    alert(123);
    cargarEmpleados();
  $('#empleados').DataTable();
});


async function cargarEmpleados(){
 const request = await fetch('empleados', {
    method: 'GET',
    headers: {
    'Accept': 'application/json',
    'Content-Type': 'application/json'
    }
  });
   const empleados = await request.json();


   let listadoHtml = '';
     for (let empleado of empleados){
     let empleadoHtml = '<tr><td>'+empleado.nombre+'</td><td>'
                        +empleado.apellido+'</td><td>'+empleado.cargo+
                        '</td><td>'+empleado.salario+'</td><td>'+empleado.id+
                        '</td><td><a td:href="#" class="btn btn-primary">Update</a><a td:href="#" class="btn btn-danger">Delete</a></td></tr>'
       listadoHtml += empleadoHtml;
     }

     document.querySelector ('#empleados tbody').outerHTML = listadoHtml;


}
