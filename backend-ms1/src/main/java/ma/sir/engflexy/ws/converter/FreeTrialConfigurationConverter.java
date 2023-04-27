package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.FreeTrialConfigurationHistory;
import ma.sir.engflexy.bean.core.FreeTrialConfiguration;
import ma.sir.engflexy.ws.dto.FreeTrialConfigurationDto;

@Component
public class FreeTrialConfigurationConverter extends AbstractConverter<FreeTrialConfiguration, FreeTrialConfigurationDto, FreeTrialConfigurationHistory> {


    public  FreeTrialConfigurationConverter(){
        super(FreeTrialConfiguration.class, FreeTrialConfigurationDto.class, FreeTrialConfigurationHistory.class);
    }

    @Override
    public FreeTrialConfiguration toItem(FreeTrialConfigurationDto dto) {
        if (dto == null) {
            return null;
        } else {
        FreeTrialConfiguration item = new FreeTrialConfiguration();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateApplicationDebut()))
                item.setDateApplicationDebut(DateUtil.stringEnToDate(dto.getDateApplicationDebut()));
            if(StringUtil.isNotEmpty(dto.getDateApplicationFin()))
                item.setDateApplicationFin(DateUtil.stringEnToDate(dto.getDateApplicationFin()));
            if(StringUtil.isNotEmpty(dto.getNombreStudentMax()))
                item.setNombreStudentMax(dto.getNombreStudentMax());
            if(StringUtil.isNotEmpty(dto.getNombreStudentMin()))
                item.setNombreStudentMin(dto.getNombreStudentMin());


        return item;
        }
    }

    @Override
    public FreeTrialConfigurationDto toDto(FreeTrialConfiguration item) {
        if (item == null) {
            return null;
        } else {
            FreeTrialConfigurationDto dto = new FreeTrialConfigurationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateApplicationDebut()!=null)
                dto.setDateApplicationDebut(DateUtil.dateTimeToString(item.getDateApplicationDebut()));
            if(item.getDateApplicationFin()!=null)
                dto.setDateApplicationFin(DateUtil.dateTimeToString(item.getDateApplicationFin()));
            if(StringUtil.isNotEmpty(item.getNombreStudentMax()))
                dto.setNombreStudentMax(item.getNombreStudentMax());
            if(StringUtil.isNotEmpty(item.getNombreStudentMin()))
                dto.setNombreStudentMin(item.getNombreStudentMin());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
