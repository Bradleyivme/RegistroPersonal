/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.registro.conecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author bradl
 */
public class MysqlConector {
    
    Connection con = null;
    
    public Connection Conectar(){
        String BaseD = "jdbc:mysql://localhost/fpersonas";
        String Usuario = "root";
        String Pass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(BaseD, Usuario, Pass);
            JOptionPane.showMessageDialog(null, "Conexión a Base de Datos hecha correctamente.");
        } catch(Exception e){ 
            JOptionPane.showMessageDialog(null, "Error en conexión a Base de Datos.");
        }
        return con;
    }
    
}
