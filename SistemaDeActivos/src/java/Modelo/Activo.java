package Modelo;
// Generated 20-Mar-2019 16:32:39 by Hibernate Tools 4.3.1



/**
 * Activo generated by hbm2java
 */
public class Activo  implements java.io.Serializable {


     private int numero;
     private Bien bien;
     private Categoria categoria;
     private Labor labor;

    public Activo() {
    }

	
    public Activo(int numero, Categoria categoria, Labor labor) {
        this.numero = numero;
        this.categoria = categoria;
        this.labor = labor;
    }
    public Activo(int numero, Bien bien, Categoria categoria, Labor labor) {
       this.numero = numero;
       this.bien = bien;
       this.categoria = categoria;
       this.labor = labor;
    }
   
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Bien getBien() {
        return this.bien;
    }
    
    public void setBien(Bien bien) {
        this.bien = bien;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Labor getLabor() {
        return this.labor;
    }
    
    public void setLabor(Labor labor) {
        this.labor = labor;
    }




}


