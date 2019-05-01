/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Editorial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author candeluchi
 */
public class ListadoEditoriales implements Serializable{
    private List<Editorial> editoriales;

    public ListadoEditoriales() {
        editoriales = new ArrayList<Editorial>();
        Editorial editorial01 = new Editorial(2222, "Benicio");
        Editorial editorial02 = new Editorial(3333, "Estrada");
        editoriales.add(editorial01);
        editoriales.add(editorial02);
    }

    public List<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(List<Editorial> editoriales) {
        this.editoriales = editoriales;
    }
    
    public void agregar(Editorial editorial){
        editoriales.add(editorial);
    }
    public void modificar(Editorial editorial){
        for(int i = 1; i<editoriales.size();i++){
            if(editoriales.get(i).getCodigo().equals(editorial.getCodigo())){
                editoriales.set(i, editorial);
            }            
        }
    }
    public void eliminar (Editorial editorial){
        for(int i = 0; i< editoriales.size();i++){
            if(editoriales.get(i).getCodigo().equals(editorial.getCodigo())){
                editoriales.remove(i);
            }
        }
    }
    
}
