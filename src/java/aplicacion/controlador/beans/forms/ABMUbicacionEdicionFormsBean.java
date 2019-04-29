/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.UbicacionEdicionBean;
import aplicacion.modelo.dominio.UbicacionEdicion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * ManagedBean que gestiona la página de ubicaciones
 * @author Ariel Vega
 */
@ManagedBean
@ViewScoped
public class ABMUbicacionEdicionFormsBean implements Serializable{
    @ManagedProperty(value = "#{ubicacionEdicionBean}")
    private UbicacionEdicionBean ubicacionEdicionBean;
    private List<UbicacionEdicion> ubicaciones;
    /**
     * Creates a new instance of ABMUbicacionEdicionFormsBean
     */
    public ABMUbicacionEdicionFormsBean() {
    }

    public void agregarUbicacion(){
        ubicacionEdicionBean.agregarUbicacion();
    }
    
    public void eliminarUbicacionSeleccionada(UbicacionEdicion ubicacionEdicionSeleccionada){
        ubicacionEdicionBean.eliminarUbicacion(ubicacionEdicionSeleccionada);
    }
    
    @PostConstruct
    public void init(){
        ubicaciones = ubicacionEdicionBean.obtenerUbicaciones();
    }
    
    public UbicacionEdicionBean getUbicacionEdicionBean() {
        return ubicacionEdicionBean;
    }

    public void setUbicacionEdicionBean(UbicacionEdicionBean ubicacionEdicionBean) {
        this.ubicacionEdicionBean = ubicacionEdicionBean;
    }

    public List<UbicacionEdicion> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<UbicacionEdicion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
    
    
}
