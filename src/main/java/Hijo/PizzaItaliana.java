package edu.ejercicios;

import java.util.List;

public class PizzaItaliana extends Pizza { {
}
    private String salsa;
    private int tiempoEnHorno;

    public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
        super(nombre, precio, ingredientes);
        this.salsa = salsa;
        this.tiempoEnHorno = tiempoEnHorno;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo la salsa: " + salsa);
        System.out.println("Tiempo en horno: " + tiempoEnHorno + " minutos");
    }

    @Override
    public String toString() {
        String pizzaString = super.toString();
        return pizzaString + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno + " minutos";
    }

    public static void main(String[] args) {
        PizzaItaliana pizzaItaliana = new PizzaItaliana("Margherita", 90.00,
                List.of("queso", "tomate", "albahaca"), "tomate", 20);
        pizzaItaliana.preparar();
        System.out.println(pizzaItaliana.toString());
}
}