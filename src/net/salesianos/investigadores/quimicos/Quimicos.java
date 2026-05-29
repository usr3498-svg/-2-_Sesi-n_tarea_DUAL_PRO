package net.salesianos.investigadores.quimicos;

import net.salesianos.investigadores.Investigadores;

public class Quimicos extends Investigadores {

    private String[] elementos;

    public Quimicos(String nombre, String especialidad, int sueldo) {
        super(nombre, especialidad, sueldo);

        this.elementos = new String[0];
    }

    public void añadirElemento(String elemento) {

        String[] nuevoArray = new String[this.elementos.length + 1];

        for (int i = 0; i < this.elementos.length; i++) {
            nuevoArray[i] = this.elementos[i];
        }

        nuevoArray[nuevoArray.length - 1] = elemento;

        this.elementos = nuevoArray;
        System.out.println("Elemento '" + elemento + "' añadido.");
    }

    @Override
    public void EstadoSueldo() {
        if (getSueldo() < 1200) {
            System.out.println("Oye, no me da ni para los pases de batalla de r6.");
        } else {
            System.out.println("Me llega pa fin de mes.");
        }
    }

    @Override
    public void Trabajar() {
        if (elementos.length == 0) {
            System.out.println("No hay elementos en la reacción para mezclar.");
            return;
        }

        for (int i = 0; i < this.elementos.length / 2; i++) {
            String temporal = this.elementos[i];
            this.elementos[i] = this.elementos[this.elementos.length - 1 - i];
            this.elementos[this.elementos.length - 1 - i] = temporal;
        }

        System.out.print("Elementos mezclados: ");
        for (String elem : this.elementos) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}