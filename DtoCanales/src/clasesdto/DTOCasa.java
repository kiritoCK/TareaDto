/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesdto;

/**
 *
 * @author user
 */
public class DTOCasa {
private String Terreno;
private String Color ;
private String Materiales ;
private int numeroCasa;
private String Peso;
private String Lugar;

    public DTOCasa(String Terreno, String Color, String Materiales, int numeroCasa, String Peso, String Lugar) {
        this.Terreno = Terreno;
        this.Color = Color;
        this.Materiales = Materiales;
        this.numeroCasa = numeroCasa;
        this.Peso = Peso;
        this.Lugar = Lugar;
    }

    public String getTerreno() {
        return Terreno;
    }

    public void setTerreno(String Terreno) {
        this.Terreno = Terreno;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMateriales() {
        return Materiales;
    }

    public void setMateriales(String Materiales) {
        this.Materiales = Materiales;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
        
}
