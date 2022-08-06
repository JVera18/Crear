/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class Proceso implements Serializable {//el array va a trabajar en memoria
    private ArrayList<Object> a = new ArrayList<Object>();
    
    public Proceso(){}
    
    public Proceso(ArrayList<Object> a){
        this.a = a;
    }
    
    public void agregarRegistro(Persona p){
        this.a.add(p);
    }

    public void modificarRegistro(int i, Persona p){
        this.a.set(i, p);
    }
    
    public void eliminarRegistro(int i){
        this.a.remove(i);
    }
    
    public Persona obtenerRegistro(int i){
        return (Persona)a.get(i);
    }
    
    public int cantidadRegistro(){
        return this.a.size();
    }
    
    public int buscaCedula(int cedula){
        for(int i = 0; i < cantidadRegistro(); i++){
            if(cedula == obtenerRegistro(i).getCedula())return i;
        }
        return -1;
    }
}
