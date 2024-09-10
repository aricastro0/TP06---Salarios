public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarSalarios() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.nombreCompleto() + ": " + empleado.calcularSalario());
        }
    }

    public EmpleadoComision empleadoConMasClientes() {
        EmpleadoComision maxEmpleado = null;
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoComision) {
                EmpleadoComision empleadoComision = (EmpleadoComision) empleado;
                if (maxEmpleado == null || empleadoComision.getClientesCaptados() > maxEmpleado.getClientesCaptados()) {
                    maxEmpleado = empleadoComision;
                }
            }
        }
        return maxEmpleado;
    }
}
