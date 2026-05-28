    package net.salesianos.investigadores.matematicos;
    import net.salesianos.investigadores.Investigadores;

    public class Matematico extends Investigadores {

        public int[][][] matriz;

        public Matematico(String nombre, String especialidad, int sueldo){
            super(nombre, especialidad, sueldo);
            this.matriz = new int[1][3][3];
        }


    }
