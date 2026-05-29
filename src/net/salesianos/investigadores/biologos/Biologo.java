package net.salesianos.investigadores.biologos;

import net.salesianos.investigadores.Investigadores;

public class Biologo extends Investigadores {

    private String[] especimenes;

    public Biologo(String nombre, String especialidad, int sueldo) {
        super(nombre, especialidad, sueldo);

        this.especimenes = new String[0];
    }

    public void añadirEspecimen(String especimen) {

        String[] nuevoArray = new String[this.especimenes.length + 1];

        for (int i = 0; i < this.especimenes.length; i++) {
            nuevoArray[i] = this.especimenes[i];
        }

        nuevoArray[nuevoArray.length - 1] = especimen;

        this.especimenes = nuevoArray;
        System.out.println("Espécimen '" + especimen + "' añadido.");
    }

    @Override
    public void EstadoSueldo() {
        if (getSueldo() < 1500) {
            System.out.println("Oye quiero mas dinero para el dlc de cyberpunk2077.");
        } else {
            System.out.println("Todo bien todo correcto y yo que me alegro.");
        }
    }

    @Override
    public void Trabajar() {
        if (especimenes.length == 0) {
            System.out.println("No hay especímenes.");
            return;
        }

        for (int i = 0; i < this.especimenes.length - 1; i++) {
            for (int j = 0; j < this.especimenes.length - i - 1; j++) {
                if (this.especimenes[j].length() > this.especimenes[j + 1].length()) {

                    String temporal = this.especimenes[j];
                    this.especimenes[j] = this.especimenes[j + 1];
                    this.especimenes[j + 1] = temporal;
                }
            }
        }

        System.out.print("Especímenes ordenados: ");
        for (String esp : this.especimenes) {
            System.out.print(esp + " ");
        }

        String eliminado = this.especimenes[this.especimenes.length - 1];

        String[] arrayReducido = new String[this.especimenes.length - 1];
        for (int i = 0; i < arrayReducido.length; i++) {
            arrayReducido[i] = this.especimenes[i];
        }

        this.especimenes = arrayReducido;

        System.out.println("Se ha eliminado el espécimen más largo: '" + eliminado + "'");
    }

}