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
    public void Trabajar() {
        System.out.println("Matemático esta perfe.");
    }

    public void Trabajar(int numero) {
        for (int matriz1 = 0; matriz1 < 3; matriz1++) {
            for (int matriz2 = 0; matriz2 < 3; matriz2++) {
                this.matriz[matriz1][matriz2] = this.matriz[matriz1][matriz2] * numero;
            }
        }
        System.out.println("La matriz multiplicada por " + numero );
    }

    public void Trabajar(int[][] otraMatriz) {
        for (int matriz1 = 0; matriz1 < 3; matriz1++) {
            for (int matriz2 = 0; matriz2 < 3; matriz2++) {
                this.matriz[matriz1][matriz2] = this.matriz[matriz1][matriz2] + otraMatriz[matriz1][matriz2];
            }
        }
    }
}