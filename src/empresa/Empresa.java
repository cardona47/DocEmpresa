/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import Vistas.Login;

/**
 *
 * @author sistemas
 */
public class Empresa {

    /**
     * Método getLogin y llamado por medio de la nueva variable a la clase Login, también, junto con setVisible permite mostrar la interfaz de la clase llamada
     */
    public static void main(String[] args) {
        Login login=Login.getLogin();
        login.setVisible(true);
    }
    
}
