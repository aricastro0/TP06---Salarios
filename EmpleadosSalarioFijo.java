class EmpleadoSalarioFijo extends Empleado {
    private double sueldoBasico;

    public EmpleadoSalarioFijo(String dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public double calcularSalario() {
        int aniosEnLaEmpresa = 2024 - anioIngreso;
        if (aniosEnLaEmpresa < 2) {
            return sueldoBasico;
        } else if (aniosEnLaEmpresa <= 5) {
            return sueldoBasico * 1.05;
        } else if (aniosEnLaEmpresa <= 10) {
            return sueldoBasico * 1.10;
        } else {
            return sueldoBasico * 1.15;
        }
    }
}
