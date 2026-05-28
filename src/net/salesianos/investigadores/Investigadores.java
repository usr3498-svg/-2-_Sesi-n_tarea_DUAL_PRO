package net.salesianos.investigadores;

public abstract class Investigadores {

    private String nombre;
    private String especialidad;
    private int sueldo;

    public Investigadores(String nombre, String especialidad, int sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void Identificacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad " + especialidad);
        System.out.println("Sueldo " + sueldo);
    }

    public void CalculoBasico(int num_inv_1, int num_inv_2) {

        System.out.println("La suma de " + num_inv_1 + " y " + num_inv_2 +
                " es " + (num_inv_1 + num_inv_2));

        System.out.println("La resta de " + num_inv_1 + " y " + num_inv_2 +
                " es " + (num_inv_1 - num_inv_2));
    }

    public void EstadoSueldo() {
        
    }
    public void Trabajar() {
        
    }

}
