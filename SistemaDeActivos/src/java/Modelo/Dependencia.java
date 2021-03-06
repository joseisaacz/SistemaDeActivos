package Modelo;
// Generated 20-Mar-2019 16:32:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Dependencia generated by hbm2java
 */
public class Dependencia  implements java.io.Serializable {


     private String codigodependecia;
     private Funcionario funcionario;
     private String nombredependencia;
     private Set labors = new HashSet(0);
     private Set solicituds = new HashSet(0);

    public Dependencia() {
    }

	
    public Dependencia(String codigodependecia, Funcionario funcionario, String nombredependencia) {
        this.codigodependecia = codigodependecia;
        this.funcionario = funcionario;
        this.nombredependencia = nombredependencia;
    }
    public Dependencia(String codigodependecia, Funcionario funcionario, String nombredependencia, Set labors, Set solicituds) {
       this.codigodependecia = codigodependecia;
       this.funcionario = funcionario;
       this.nombredependencia = nombredependencia;
       this.labors = labors;
       this.solicituds = solicituds;
    }
   
    public String getCodigodependecia() {
        return this.codigodependecia;
    }
    
    public void setCodigodependecia(String codigodependecia) {
        this.codigodependecia = codigodependecia;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public String getNombredependencia() {
        return this.nombredependencia;
    }
    
    public void setNombredependencia(String nombredependencia) {
        this.nombredependencia = nombredependencia;
    }
    public Set getLabors() {
        return this.labors;
    }
    
    public void setLabors(Set labors) {
        this.labors = labors;
    }
    public Set getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set solicituds) {
        this.solicituds = solicituds;
    }




}


