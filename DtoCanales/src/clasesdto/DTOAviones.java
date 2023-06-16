/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesdto;

/**
 *
 * @author user
 */
public class DTOAviones {
private String Material ;
private String color ;
private String tamaño ;
private int Codigo;
private String Año ;
private String Peso;

    public DTOAviones(String Material, String color, String tamaño, int Codigo, String Año, String Peso) {
        this.Material = Material;
        this.color = color;
        this.tamaño = tamaño;
        this.Codigo = Codigo;
        this.Año = Año;
        this.Peso = Peso;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
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

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

}
