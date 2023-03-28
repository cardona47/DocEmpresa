/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Daniel Arteaga
 */
public interface DAOLogin {
    /**
     * Método que permite la verificación de usuarios 
     * @param usuario Nombre de usuario
     * @param contrasenia Contraseña de usuario
     * @return Por medio de True o False(de tipo booleano) se verifica y se devuelve 
     */
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    /**
     * Método que permite mostrar usuario registrado 
     */
    public String getUsuario();
    
    /**
     * Método que permite el cambio de contraseña 
     */
    public boolean CambiarContrasenia(String contrasenia);
    
}
