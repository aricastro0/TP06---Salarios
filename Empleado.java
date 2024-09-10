abstract class Empleado {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected int anioIngreso;

    public Empleado(String dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public abstract double calcularSalario();

    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
}
