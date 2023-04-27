package  ma.sir.engflexy.ws.dto;

import ma.sir.engflexy.zynerator.audit.Log;
import ma.sir.engflexy.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaqTypeDto  extends AuditBaseDto {

    private String destinataire  ;
    private String libelle  ;




    public FaqTypeDto(){
        super();
    }



    @Log
    public String getDestinataire(){
        return this.destinataire;
    }
    public void setDestinataire(String destinataire){
        this.destinataire = destinataire;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }






}
