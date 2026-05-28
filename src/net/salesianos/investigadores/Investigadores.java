package net.salesianos.investigadores;

public class Investigadores {

    private String nombre;
    private String especialidad;
    private int sueldo;

    public Investigadores(String nombre, String especialidad, int sueldo){
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

}
