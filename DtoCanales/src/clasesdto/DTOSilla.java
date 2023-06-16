/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesdto;

/**
 *
 * @author user
 */
public class DTOSilla {
private String marca;
private String modelo ;
private String material ;
private int cantidad;
private String colr;
private String peso;

    public DTOSilla(String marca, String modelo, String material, int cantidad, String colr, String peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.material = material;
        this.cantidad = cantidad;
        this.colr = colr;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColr() {
        return colr;
    }

    public void setColr(String colr) {
        this.colr = colr;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

}
