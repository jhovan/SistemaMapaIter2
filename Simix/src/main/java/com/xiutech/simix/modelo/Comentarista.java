package com.xiutech.simix.modelo;

import java.util.HashSet;
import java.util.Set;

public class Comentarista  implements java.io.Serializable {

     private String correo;
     private String nombre;
     private String contrasenia;
     private boolean estado;
     private Set calificacions = new HashSet(0);
     private Set comentarios = new HashSet(0);

    public Comentarista() {
    }

	
    public Comentarista(String correo, String nombre, String contrasenia, boolean estado) {
        this.correo = correo;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.estado = estado;
    }
    public Comentarista(String correo, String nombre, String contrasenia, boolean estado, Set calificacions, Set comentarios) {
       this.correo = correo;
       this.nombre = nombre;
       this.contrasenia = contrasenia;
       this.estado = estado;
       this.calificacions = calificacions;
       this.comentarios = comentarios;
    }
   
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Set getCalificacions() {
        return this.calificacions;
    }
    
    public void setCalificacions(Set calificacions) {
        this.calificacions = calificacions;
    }
    public Set getComentarios() {
        return this.comentarios;
    }
    
    public void setComentarios(Set comentarios) {
        this.comentarios = comentarios;
    }




}


