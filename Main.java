public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Empleado emp1 = new EmpleadoSalarioFijo("123", "Ana", "Pérez", 2015, 30000);
        Empleado emp2 = new EmpleadoComision("456", "Carlos", "García", 2018, 50, 500);
        Empleado emp3 = new EmpleadoComision("789", "Lucía", "López", 2019, 30, 400);

        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);

        empresa.mostrarSalarios();

        EmpleadoComision mejorEmpleado = empresa.empleadoConMasClientes();
        if (mejorEmpleado != null) {
            System.out.println("El empleado con más clientes es: " + mejorEmpleado.nombreCompleto());
        }
    }
}
