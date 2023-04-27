package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.InteretEtudiantHistory;
import ma.sir.engflexy.bean.core.InteretEtudiant;
import ma.sir.engflexy.ws.dto.InteretEtudiantDto;

@Component
public class InteretEtudiantConverter extends AbstractConverter<InteretEtudiant, InteretEtudiantDto, InteretEtudiantHistory> {


    public  InteretEtudiantConverter(){
        super(InteretEtudiant.class, InteretEtudiantDto.class, InteretEtudiantHistory.class);
    }

    @Override
    public InteretEtudiant toItem(InteretEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        InteretEtudiant item = new InteretEtudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public InteretEtudiantDto toDto(InteretEtudiant item) {
        if (item == null) {
            return null;
        } else {
            InteretEtudiantDto dto = new InteretEtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
