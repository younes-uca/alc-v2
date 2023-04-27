package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.FaqTypeHistory;
import ma.sir.engflexy.bean.core.FaqType;
import ma.sir.engflexy.ws.dto.FaqTypeDto;

@Component
public class FaqTypeConverter extends AbstractConverter<FaqType, FaqTypeDto, FaqTypeHistory> {


    public  FaqTypeConverter(){
        super(FaqType.class, FaqTypeDto.class, FaqTypeHistory.class);
    }

    @Override
    public FaqType toItem(FaqTypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        FaqType item = new FaqType();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDestinataire()))
                item.setDestinataire(dto.getDestinataire());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public FaqTypeDto toDto(FaqType item) {
        if (item == null) {
            return null;
        } else {
            FaqTypeDto dto = new FaqTypeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getDestinataire()))
                dto.setDestinataire(item.getDestinataire());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
