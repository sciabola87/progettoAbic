package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractTipoUtilizzo entity provides the base persistence definition of the TipoUtilizzo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTipoUtilizzo  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idTipoUtilizzo;
     private String descrizione;
     private Set assetFisicos = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractTipoUtilizzo() {
    }

    
    /** full constructor */
    public AbstractTipoUtilizzo(String descrizione, Set assetFisicos) {
        this.descrizione = descrizione;
        this.assetFisicos = assetFisicos;
    }

   
    // Property accessors

    public Integer getIdTipoUtilizzo() {
        return this.idTipoUtilizzo;
    }
    
    public void setIdTipoUtilizzo(Integer idTipoUtilizzo) {
        this.idTipoUtilizzo = idTipoUtilizzo;
    }

    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Set getAssetFisicos() {
        return this.assetFisicos;
    }
    
    public void setAssetFisicos(Set assetFisicos) {
        this.assetFisicos = assetFisicos;
    }
   








}