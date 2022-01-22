/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoursJava4;

import CoursJava4.enum_.Droits;

/**
 *
 * @author Mike
 */
public class Admin extends Utilisateur{

    public Admin() {
    }

    public Admin(String login, String motdepass) {
        super(login, motdepass);
    }

    public Admin(String login, String motdepass, Droits droit) {
        super(login, motdepass, droit);
    }
    
}
