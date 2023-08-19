package edu.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nombre;
    private double precio;
    private List<String> ingredientes;
    private List<Topping> toppings;

    public Pizza(String nombre, double precio, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.toppings = new ArrayList<>();  // Inicializar la lista de toppings
    }

    public void preparar() {
        System.out.println("La pizza " + nombre + " está lista para ser servida.");
    }

    public void agregarTopping(Topping topping) {
        toppings.add(topping);
        System.out.println("Topping " + topping.toString() + " agregado a la pizza.");
    }

    @Override
    public String toString() {
        return "Pizza " + nombre + " ($" + precio + ") con " + ingredientes.toString();
}
    }

