class EmpleadoComision extends Empleado {
    private static final double SALARIO_MINIMO = 20000;
    private int clientesCaptados;
    private double montoPorCliente;

    public EmpleadoComision(String dni, String nombre, String apellido, int anioIngreso, int clientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.clientesCaptados = clientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public double calcularSalario() {
        double salario = clientesCaptados * montoPorCliente;
        return Math.max(salario, SALARIO_MINIMO);
    }

    public int getClientesCaptados() {
        return clientesCaptados;
    }
}
