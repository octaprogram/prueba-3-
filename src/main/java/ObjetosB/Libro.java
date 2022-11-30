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
public class Libro extends Texto {

    private String Editorial;
    private String ISBN;

    public Libro() {
        super();
    }

    public Libro(String p1, String p2, String p3, String l1, String l2) {
        super(p1, p2, p3);
        this.Editorial = l1;
        this.ISBN = l2;
    }

    public Libro(Libro l) {
        super(l);
        this.Editorial = l.Editorial;
        this.ISBN = l.ISBN;
    }

    public String getEdit() {
        return Editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setEdit(String a) {
        this.Editorial = a;
    }

    public void setISBN(String a) {
        this.ISBN = a;
    }

    @Override
    public String toString() {
        return super.toString() + "Editorial:" + Editorial + "\n" + "ISBN:" + ISBN + "\n";
    }

}
