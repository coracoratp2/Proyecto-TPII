package Modelo;
// Generated 27/05/2016 04:09:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vehiculos generated by hbm2java
 */
public class Vehiculos  implements java.io.Serializable {


     private String placaVehiculo;
     private Asociados asociados;
     private Choferes choferes;
     private Cobradores cobradores;
     private String modeloVehiculo;
     private String anioVehiculo;
     private String estadoVehiculo;
     private String dsanVehiculo;
     private Set quejases = new HashSet(0);
     private Set salidases = new HashSet(0);

    public Vehiculos() {
    }

	
    public Vehiculos(String placaVehiculo, Asociados asociados, Choferes choferes, Cobradores cobradores, String modeloVehiculo, String anioVehiculo) {
        this.placaVehiculo = placaVehiculo;
        this.asociados = asociados;
        this.choferes = choferes;
        this.cobradores = cobradores;
        this.modeloVehiculo = modeloVehiculo;
        this.anioVehiculo = anioVehiculo;
    }
    public Vehiculos(String placaVehiculo, Asociados asociados, Choferes choferes, Cobradores cobradores, String modeloVehiculo, String anioVehiculo, String estadoVehiculo, String dsanVehiculo, Set quejases, Set salidases) {
       this.placaVehiculo = placaVehiculo;
       this.asociados = asociados;
       this.choferes = choferes;
       this.cobradores = cobradores;
       this.modeloVehiculo = modeloVehiculo;
       this.anioVehiculo = anioVehiculo;
       this.estadoVehiculo = estadoVehiculo;
       this.dsanVehiculo = dsanVehiculo;
       this.quejases = quejases;
       this.salidases = salidases;
    }
   
    public String getPlacaVehiculo() {
        return this.placaVehiculo;
    }
    
    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }
    public Asociados getAsociados() {
        return this.asociados;
    }
    
    public void setAsociados(Asociados asociados) {
        this.asociados = asociados;
    }
    public Choferes getChoferes() {
        return this.choferes;
    }
    
    public void setChoferes(Choferes choferes) {
        this.choferes = choferes;
    }
    public Cobradores getCobradores() {
        return this.cobradores;
    }
    
    public void setCobradores(Cobradores cobradores) {
        this.cobradores = cobradores;
    }
    public String getModeloVehiculo() {
        return this.modeloVehiculo;
    }
    
    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }
    public String getAnioVehiculo() {
        return this.anioVehiculo;
    }
    
    public void setAnioVehiculo(String anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }
    public String getEstadoVehiculo() {
        return this.estadoVehiculo;
    }
    
    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }
    public String getDsanVehiculo() {
        return this.dsanVehiculo;
    }
    
    public void setDsanVehiculo(String dsanVehiculo) {
        this.dsanVehiculo = dsanVehiculo;
    }
    public Set getQuejases() {
        return this.quejases;
    }
    
    public void setQuejases(Set quejases) {
        this.quejases = quejases;
    }
    public Set getSalidases() {
        return this.salidases;
    }
    
    public void setSalidases(Set salidases) {
        this.salidases = salidases;
    }




}


