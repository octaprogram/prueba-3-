/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosB;

/**
 *
 * @author matyr
 */
public class Texto {

    private String CodBiblio;
    private String Nombre;
    private String Autor;

    public Texto() {
    }

    public Texto(String e1, String e2, String e3) {
        this.CodBiblio = e1;
        this.Nombre = e2;
        this.Autor = e3;
    }

    public Texto(Texto t) {
        this.CodBiblio = t.CodBiblio;
        this.Autor = t.Autor;
        this.Nombre = t.Nombre;
    }

    public String getCod() {
        return CodBiblio;
    }

    public String getNbre() {
        return Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setCod(String ec) {
        this.CodBiblio = ec;
    }

    public void setNbre(String ec) {
        this.Nombre = ec;
    }

    public void setAutor(String ec) {
        this.Autor = ec;
    }

    @Override
    public String toString() {
        return "Codigo Biblioteca:" + CodBiblio + "\n" + "Nombre:" + Nombre + "\n" + "Autor:" + Autor + "\n";
    }

}
