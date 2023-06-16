
package clasesdto;


public class DTOCocina {
 private String Color  ;
private String Material ;
private String tamaño ;
private int numeroOrnilla;
private String compicion;
private String peso;

    public DTOCocina(String Color, String Material, String tamaño, int numeroOrnilla, String compicion, String peso) {
        this.Color = Color;
        this.Material = Material;
        this.tamaño = tamaño;
        this.numeroOrnilla = numeroOrnilla;
        this.compicion = compicion;
        this.peso = peso;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumeroOrnilla() {
        return numeroOrnilla;
    }

    public void setNumeroOrnilla(int numeroOrnilla) {
        this.numeroOrnilla = numeroOrnilla;
    }

    public String getCompicion() {
        return compicion;
    }

    public void setCompicion(String compicion) {
        this.compicion = compicion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

}
