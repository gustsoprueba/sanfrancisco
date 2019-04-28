package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Datasource de autores
 * @author Ariel Vega
 */
public class ListadoAutores implements Serializable{
    /**
     * autores de alguna de las publicaciones disponibles
     */
    private List<Autor> autores;

    /**
     * Constructor por defecto
     */
    public ListadoAutores() {
        autores = new ArrayList<>(); // inicializa autores
        //Creo un autor por defecto en el array de autores
        Autor autor = new Autor(2345, "Pascal", "blais");
        autores.add(autor);
    }

    public void agregar(Autor autor){
        autores.add(autor);
    }
    
    public void eliminar(Autor autor){
        for(int i = 0; i< autores.size();i++){
            if(autores.get(i).getCodigo().equals(autor.getCodigo())){
                autores.remove(i);
            }
        }
        
    }
    
    public void modificar(Autor autor){
        for(Autor autorActual: autores){
            if(autorActual.getCodigo().equals(autor.getCodigo())){
                autorActual = autor;
            }
        }
    }
    
    /**
     * Constructor parametrizado
     * @param autores el listado de autores
     */
    public ListadoAutores(List<Autor> autores) {
        this.autores = autores;
    }

    // sección de getters y setters
    
    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    
    
}
