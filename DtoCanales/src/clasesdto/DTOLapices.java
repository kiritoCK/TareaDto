/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesdto;

/**
 *
 * @author user
 */
public class DTOLapices {
private String nombre ;
private String color ;
private String tamaño ;
private int grafito;
private int Precio;
private String material;

    public DTOLapices(String nombre, String color, String tamaño, int grafito, int Precio, String material) {
        this.nombre = nombre;
        this.color = color;
        this.tamaño = tamaño;
        this.grafito = grafito;
        this.Precio = Precio;
        this.material = material;
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

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getGrafito() {
        return grafito;
    }

    public void setGrafito(int grafito) {
        this.grafito = grafito;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
