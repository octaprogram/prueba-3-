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
public class Practico extends Apunte {

    private int[] fecha;

    public Practico() {
        super();
    }

    public Practico(String a1, String a2, String a3, String a4, String a5, int a6, int a7[]) {
        super(a1, a2, a3, a4, a5, a6);
        this.fecha = a7;
    }

    public Practico(Practico p) {
        super(p);
        this.fecha = p.fecha;
    }

    public int[] getFecha() {
        return fecha;
    }
public void setFecha(int f[]) {
this.fecha=f;
}
public String toSTring(){
return super.toString()+"Fecha:"+fecha[0]+"/"+fecha[1]+"/"+fecha[2]+"\n";
}

}
