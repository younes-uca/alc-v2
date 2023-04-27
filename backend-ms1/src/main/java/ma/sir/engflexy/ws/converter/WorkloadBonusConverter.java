package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.WorkloadBonusHistory;
import ma.sir.engflexy.bean.core.WorkloadBonus;
import ma.sir.engflexy.ws.dto.WorkloadBonusDto;

@Component
public class WorkloadBonusConverter extends AbstractConverter<WorkloadBonus, WorkloadBonusDto, WorkloadBonusHistory> {


    public  WorkloadBonusConverter(){
        super(WorkloadBonus.class, WorkloadBonusDto.class, WorkloadBonusHistory.class);
    }

    @Override
    public WorkloadBonus toItem(WorkloadBonusDto dto) {
        if (dto == null) {
            return null;
        } else {
        WorkloadBonus item = new WorkloadBonus();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNombreSession()))
                item.setNombreSession(dto.getNombreSession());
            if(StringUtil.isNotEmpty(dto.getPrix()))
                item.setPrix(dto.getPrix());


        return item;
        }
    }

    @Override
    public WorkloadBonusDto toDto(WorkloadBonus item) {
        if (item == null) {
            return null;
        } else {
            WorkloadBonusDto dto = new WorkloadBonusDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNombreSession()))
                dto.setNombreSession(item.getNombreSession());
            if(StringUtil.isNotEmpty(item.getPrix()))
                dto.setPrix(item.getPrix());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
