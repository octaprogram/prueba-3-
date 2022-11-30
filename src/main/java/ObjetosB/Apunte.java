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
public class Apunte extends Texto {

    private String Catedra;
    private String Tema;
    private int CantH;

    public Apunte() {
        super();
    }

    public Apunte(String t1, String t2, String t3, String a1, String a2, int a3) {
        super(t1, t2, t3);
        this.Catedra = a1;
        this.Tema = a2;
        this.CantH = a3;
    }

    public Apunte(Apunte a) {
        super(a);
        this.CantH = a.CantH;
        this.Catedra = a.Catedra;
        this.Tema = a.Tema;
    }

    public String getCate() {
        return Catedra;
    }

    public String getTema() {
        return Tema;
    }

    public int getCantH() {
        return CantH;
    }

    public void setCate(String a) {
        this.Catedra = a;
    }

    public void setTema(String a) {
        this.Tema = a;
    }

    public void setCantH(int a) {
        this.CantH = a;
    }

    @Override
    public String toString() {
        return super.toString() + "Catedra:" + Catedra + "\n" + "Tema:" + Tema + "\n" + "Cantidad de Hojas:" + CantH + "\n";
    }

}
