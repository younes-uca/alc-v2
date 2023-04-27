package  ma.sir.engflexy.ws.dto;

import ma.sir.engflexy.zynerator.audit.Log;
import ma.sir.engflexy.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class SkillDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;




    public SkillDto(){
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






}
