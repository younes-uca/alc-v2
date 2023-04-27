package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.TypeDeQuestionHistory;
import ma.sir.engflexy.bean.core.TypeDeQuestion;
import ma.sir.engflexy.ws.dto.TypeDeQuestionDto;

@Component
public class TypeDeQuestionConverter extends AbstractConverter<TypeDeQuestion, TypeDeQuestionDto, TypeDeQuestionHistory> {


    public  TypeDeQuestionConverter(){
        super(TypeDeQuestion.class, TypeDeQuestionDto.class, TypeDeQuestionHistory.class);
    }

    @Override
    public TypeDeQuestion toItem(TypeDeQuestionDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeDeQuestion item = new TypeDeQuestion();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getLib()))
                item.setLib(dto.getLib());


        return item;
        }
    }

    @Override
    public TypeDeQuestionDto toDto(TypeDeQuestion item) {
        if (item == null) {
            return null;
        } else {
            TypeDeQuestionDto dto = new TypeDeQuestionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getLib()))
                dto.setLib(item.getLib());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
