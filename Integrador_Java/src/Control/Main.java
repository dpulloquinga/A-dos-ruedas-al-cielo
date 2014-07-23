package Control;

import conexion.BaseDatos;
import ventanas.Login_Win;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidpulloquinga
 */

public class Main {
    public static void main (String[] args){
        BaseDatos conexion;
        conexion = new BaseDatos("localhost","root","");
        Login_Win login = new Login_Win();
        login.setVisible(true);
    }
}
