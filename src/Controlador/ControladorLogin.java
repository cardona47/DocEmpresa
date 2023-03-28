/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author sistemas
 * 
 */
public class ControladorLogin implements DAOLogin{
    
    private static ControladorLogin controladorLogin;
    private String usuario; //Nombre de usuario
    private String contrasenia; //Contraseña de usuario  
    
    
   
    private ControladorLogin() { //Metodo usado para implementar elementos en la clase ControladorLogin()
        
    }
    
    
     //Singleton para controlar instancias
    
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }
    
    /**
     * Método que permite la verificación de usuarios
     * @param usuario Nombre de usuario
     * @param contrasenia Contraseña de usuario
     * @return Por medio de True o False(de tipo booleano) se verifica y se devuelve 
     */
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        boolean estado=false;
        
        if((usuario.equals("daniel"))&&(contrasenia.equals("12345")))
            estado=true;
        
        return estado;
    }

    @Override
    /**
     * Método que permite mostrar el usuario registrado
     */
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    
    //Mtodoue permite el cambio de contraseña, guardando en contrasenia la actualizada
    
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
}
