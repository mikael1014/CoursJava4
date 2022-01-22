/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoursJava4.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mike
 */
public class GererDonnees<T> {

    private List<T> liste = new ArrayList<T>();

    public void ajouter(T objet) {
        liste.add(objet);
    }

    public void remplacer(int i, T objet) {
        liste.set(i, objet);
    }

//    public void save(T object){
//        return T;
//    }        
    
    public List<T> getAll() {
        return liste;
    }

    public T get(int id) {
        return liste.get(id);
    }

}
