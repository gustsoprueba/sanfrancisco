/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.validadores;

import aplicacion.modelo.dominio.Publicacion;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Ariel Vega
 */
@FacesValidator
public class ISBNValidator implements Validator{

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String isbn = o.toString();
        List<Publicacion> publicaciones = (List<Publicacion>)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("publicaciones");
        if(publicaciones == null){
            return;
        }else{
            for(Publicacion p:publicaciones){
                if(p.getIsbn().equals(isbn)){
                    throw new ValidatorException(
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                    "ISBN existente",
                                    "ISBN existente"));
                }
            }
        }
    }
    
}
