package co.com.udem.model;

public class Planta {
    private String nombre;
    private String color;
    public int edad;

    public Planta(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "<Planta>{" +
                "<nombre>='" + nombre + '\'' +
                ", <color>='" + color + '\'' +
                ", <edad>=" + edad +
                '}';
    }
}
