package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.sir.engflexy.bean.core.FreeTrialTeacherEmailTemplate;
import ma.sir.engflexy.ws.dto.FreeTrialTeacherEmailTemplateDto;

@Component
public class FreeTrialTeacherEmailTemplateConverter extends AbstractConverter<FreeTrialTeacherEmailTemplate, FreeTrialTeacherEmailTemplateDto, FreeTrialTeacherEmailTemplateHistory> {


    public  FreeTrialTeacherEmailTemplateConverter(){
        super(FreeTrialTeacherEmailTemplate.class, FreeTrialTeacherEmailTemplateDto.class, FreeTrialTeacherEmailTemplateHistory.class);
    }

    @Override
    public FreeTrialTeacherEmailTemplate toItem(FreeTrialTeacherEmailTemplateDto dto) {
        if (dto == null) {
            return null;
        } else {
        FreeTrialTeacherEmailTemplate item = new FreeTrialTeacherEmailTemplate();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getObject()))
                item.setObject(dto.getObject());
            if(StringUtil.isNotEmpty(dto.getCorps()))
                item.setCorps(dto.getCorps());
            if(StringUtil.isNotEmpty(dto.getSource()))
                item.setSource(dto.getSource());


        return item;
        }
    }

    @Override
    public FreeTrialTeacherEmailTemplateDto toDto(FreeTrialTeacherEmailTemplate item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialTeacherEmailTemplateDto dto = new FreeTrialTeacherEmailTemplateDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getObject()))
                dto.setObject(item.getObject());
            if(StringUtil.isNotEmpty(item.getCorps()))
                dto.setCorps(item.getCorps());
            if(StringUtil.isNotEmpty(item.getSource()))
                dto.setSource(item.getSource());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
