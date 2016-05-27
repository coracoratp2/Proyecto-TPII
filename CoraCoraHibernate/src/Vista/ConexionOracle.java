package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RicardoManuél
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionOracle {
private Connection conexion;
private Statement st;
private ResultSet rs;
    
    public Connection getConexion() {
        return conexion;
    }
    
    public Statement getst() {
        return st;
    }
    
    public ResultSet getrs() {
        return rs;
    }

        public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
        
        public void setrs(ResultSet rs) {
        this.rs = rs;
    }
        
    public void setst(Statement st) {
        this.st = st;
    }
    
    public ConexionOracle Conectar()
    {
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion= DriverManager.getConnection(BaseDeDatos,"BD_CORACORA","oracle");
        st = conexion.createStatement();
        if(conexion!=null)
        {
        //System.out.println("Conexion exitosa ");
        }
        else{System.out.println("Conexion fallida");}
        }
        catch(Exception e)
        {e.printStackTrace();}
       
    return this;
    }

}

