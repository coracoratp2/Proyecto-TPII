package Modelo;
// Generated 27/05/2016 04:09:36 PM by Hibernate Tools 4.3.1



/**
 * Quejas generated by hbm2java
 */
public class Quejas  implements java.io.Serializable {


     private String idQueja;
     private Vehiculos vehiculos;
     private String quejaVehiculo;

    public Quejas() {
    }

	
    public Quejas(String idQueja, Vehiculos vehiculos) {
        this.idQueja = idQueja;
        this.vehiculos = vehiculos;
    }
    public Quejas(String idQueja, Vehiculos vehiculos, String quejaVehiculo) {
       this.idQueja = idQueja;
       this.vehiculos = vehiculos;
       this.quejaVehiculo = quejaVehiculo;
    }
   
    public String getIdQueja() {
        return this.idQueja;
    }
    
    public void setIdQueja(String idQueja) {
        this.idQueja = idQueja;
    }
    public Vehiculos getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }
    public String getQuejaVehiculo() {
        return this.quejaVehiculo;
    }
    
    public void setQuejaVehiculo(String quejaVehiculo) {
        this.quejaVehiculo = quejaVehiculo;
    }




}

