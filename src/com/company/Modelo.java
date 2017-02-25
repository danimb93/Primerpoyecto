package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dani on  21/02/2017.
 */
public class Modelo {

    public List<Etakemon> db;
    private int idGenerado;

    public Modelo(){

        db = new ArrayList<>();
        this.idGenerado = 0;
    }

    public void add(Etakemon e){
        e.setId(this.idGenerado);
        db.add(e);
        this.idGenerado++;
    }

    public boolean del (int id){
        for (int i=0;i<db.size();i++){
            if (db.get(i).getId()==id){
                db.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Etakemon> getLista(){
        return db;
    }

    public Etakemon buscarNombre(String nombre){
        Etakemon encontrado=new Etakemon();
        for (int i=0;i<db.size();i++){
            if (db.get(i).nombre.equals(nombre)){
                encontrado = db.get(i);
                break;
            }
        }
        return encontrado;
    }
}
