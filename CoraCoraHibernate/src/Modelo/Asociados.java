package Modelo;
// Generated 27/05/2016 04:09:36 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Asociados generated by hbm2java
 */
public class Asociados  implements java.io.Serializable {


     private String dniAsociado;
     private String nomAsociado;
     private String apeAsociado;
     private String dirAsociado;
     private String disAsociado;
     private Set vehiculoses = new HashSet(0);

    public Asociados() {
    }

	
    public Asociados(String dniAsociado, String nomAsociado, String apeAsociado, String dirAsociado, String disAsociado) {
        this.dniAsociado = dniAsociado;
        this.nomAsociado = nomAsociado;
        this.apeAsociado = apeAsociado;
        this.dirAsociado = dirAsociado;
        this.disAsociado = disAsociado;
    }
    public Asociados(String dniAsociado, String nomAsociado, String apeAsociado, String dirAsociado, String disAsociado, Set vehiculoses) {
       this.dniAsociado = dniAsociado;
       this.nomAsociado = nomAsociado;
       this.apeAsociado = apeAsociado;
       this.dirAsociado = dirAsociado;
       this.disAsociado = disAsociado;
       this.vehiculoses = vehiculoses;
    }
   
    public String getDniAsociado() {
        return this.dniAsociado;
    }
    
    public void setDniAsociado(String dniAsociado) {
        this.dniAsociado = dniAsociado;
    }
    public String getNomAsociado() {
        return this.nomAsociado;
    }
    
    public void setNomAsociado(String nomAsociado) {
        this.nomAsociado = nomAsociado;
    }
    public String getApeAsociado() {
        return this.apeAsociado;
    }
    
    public void setApeAsociado(String apeAsociado) {
        this.apeAsociado = apeAsociado;
    }
    public String getDirAsociado() {
        return this.dirAsociado;
    }
    
    public void setDirAsociado(String dirAsociado) {
        this.dirAsociado = dirAsociado;
    }
    public String getDisAsociado() {
        return this.disAsociado;
    }
    
    public void setDisAsociado(String disAsociado) {
        this.disAsociado = disAsociado;
    }
    public Set getVehiculoses() {
        return this.vehiculoses;
    }
    
    public void setVehiculoses(Set vehiculoses) {
        this.vehiculoses = vehiculoses;
    }




}


