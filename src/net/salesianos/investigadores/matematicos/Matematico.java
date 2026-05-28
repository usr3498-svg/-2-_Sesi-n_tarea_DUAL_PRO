package net.salesianos.investigadores.matematicos;
import net.salesianos.investigadores.Investigadores;

public class Matematico extends Investigadores {

    public int[][] matriz;

    public Matematico(String nombre, String especialidad, int sueldo) {
        super(nombre, especialidad, sueldo);
        this.matriz = new int[3][3];
    }

    @Override
    public void EstadoSueldo(){
        if (getSueldo() < 1800) {
            System.out.println("Jefe quiero un aumento para el lego batman");
        } else{
            System.out.println("Agusto con la paga boss");
        }
    }

    @Override
    public void Trabajar(){
        
    }

}
