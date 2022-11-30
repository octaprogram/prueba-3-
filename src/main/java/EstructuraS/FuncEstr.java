/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructuraS;
import ObjetosB.*;
/**
 *
 * @author matyr
 */
public interface FuncEstr {
public int cardinalidad (); //retorna la cantidad de elementos de la estructura
public Boolean inStruc(Texto p); //retorna true si arg. esta en la estruc., sino false
public void muestroEstruc(); // muestra contenido ded la estruc. por pantalla.
public ListaBiblio drop(int x ); // deja caer x primeros elementos de la estruc.
}
