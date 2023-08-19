package edu.ejercicios;

public class Topping {
    private String nombre;

    // Constructor
    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        pizza.agregarTopping(this);
    }

    @Override
    public String toString() {
        return nombre;
}

}
