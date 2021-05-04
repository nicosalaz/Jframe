/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolás Salazar
 */
public class Principal {
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        Ventana_dos v2 = new Ventana_dos();
        v1.setVisible(true);
        if (v1.estado == true) {
            v2.setVisible(true);
        }
            
        
    }
}
