package Modelo;
// Generated 27/05/2016 04:09:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cobradores generated by hbm2java
 */
public class Cobradores  implements java.io.Serializable {


     private String dniCobrador;
     private String nomCobrador;
     private String apeCobrador;
     private Set vehiculoses = new HashSet(0);

    public Cobradores() {
    }

	
    public Cobradores(String dniCobrador, String nomCobrador, String apeCobrador) {
        this.dniCobrador = dniCobrador;
        this.nomCobrador = nomCobrador;
        this.apeCobrador = apeCobrador;
    }
    public Cobradores(String dniCobrador, String nomCobrador, String apeCobrador, Set vehiculoses) {
       this.dniCobrador = dniCobrador;
       this.nomCobrador = nomCobrador;
       this.apeCobrador = apeCobrador;
       this.vehiculoses = vehiculoses;
    }
   
    public String getDniCobrador() {
        return this.dniCobrador;
    }
    
    public void setDniCobrador(String dniCobrador) {
        this.dniCobrador = dniCobrador;
    }
    public String getNomCobrador() {
        return this.nomCobrador;
    }
    
    public void setNomCobrador(String nomCobrador) {
        this.nomCobrador = nomCobrador;
    }
    public String getApeCobrador() {
        return this.apeCobrador;
    }
    
    public void setApeCobrador(String apeCobrador) {
        this.apeCobrador = apeCobrador;
    }
    public Set getVehiculoses() {
        return this.vehiculoses;
    }
    
    public void setVehiculoses(Set vehiculoses) {
        this.vehiculoses = vehiculoses;
    }




}


