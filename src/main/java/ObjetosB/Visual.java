/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosB;
import java.util.ArrayList;
/**
 *
 * @author matyr
 */
public class Visual extends Apunte{
    private ArrayList<String> linksOnline;
    
    public Visual(){
    super();
    }
    public Visual(String a1, String a2, String a3, String a4, String a5, int a6,ArrayList<String> a7){
    super(a1, a2, a3, a4, a5, a6);
    this.linksOnline=a7;
    }
public Visual (Visual v){
super(v);
this.linksOnline=v.linksOnline;
}
public ArrayList<String> getLinks(){
return linksOnline;
}
public void setLinks(ArrayList<String> v){
this.linksOnline=v;
}
public void showLinks(){
    System.out.println("Links:");
    System.out.println("\n"+linksOnline);
}
public String toString(){
   return super.toString()+"Links:"+linksOnline+"\n";
}



}
