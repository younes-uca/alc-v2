package  ma.sir.engflexy.ws.dto;

import ma.sir.engflexy.zynerator.audit.Log;
import ma.sir.engflexy.zynerator.dto.AuditBaseDtoEnhanced;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServicesDto  extends AuditBaseDtoEnhanced {

    private String code  ;
    private String libelle  ;
    private String description  ;




    public ServicesDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }






}
