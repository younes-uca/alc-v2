package  ma.sir.engflexy.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.engflexy.bean.core.Prof;

import ma.sir.engflexy.zynerator.util.StringUtil;
import ma.sir.engflexy.zynerator.converter.AbstractConverter;
import ma.sir.engflexy.zynerator.util.DateUtil;
import ma.sir.engflexy.bean.history.WorkloadBonusProfHistory;
import ma.sir.engflexy.bean.core.WorkloadBonusProf;
import ma.sir.engflexy.ws.dto.WorkloadBonusProfDto;

@Component
public class WorkloadBonusProfConverter extends AbstractConverter<WorkloadBonusProf, WorkloadBonusProfDto, WorkloadBonusProfHistory> {

    @Autowired
    private WorkloadBonusConverter workloadBonusConverter ;
    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private SalaryConverter salaryConverter ;
    private boolean workloadBonus;
    private boolean prof;
    private boolean salary;

    public  WorkloadBonusProfConverter(){
        super(WorkloadBonusProf.class, WorkloadBonusProfDto.class, WorkloadBonusProfHistory.class);
    }

    @Override
    public WorkloadBonusProf toItem(WorkloadBonusProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        WorkloadBonusProf item = new WorkloadBonusProf();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getMois()))
                item.setMois(dto.getMois());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(this.workloadBonus && dto.getWorkloadBonus()!=null)
                item.setWorkloadBonus(workloadBonusConverter.toItem(dto.getWorkloadBonus())) ;

            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(this.salary && dto.getSalary()!=null)
                item.setSalary(salaryConverter.toItem(dto.getSalary())) ;



        return item;
        }
    }

    @Override
    public WorkloadBonusProfDto toDto(WorkloadBonusProf item) {
        if (item == null) {
            return null;
        } else {
            WorkloadBonusProfDto dto = new WorkloadBonusProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getMois()))
                dto.setMois(item.getMois());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
        if(this.workloadBonus && item.getWorkloadBonus()!=null) {
            dto.setWorkloadBonus(workloadBonusConverter.toDto(item.getWorkloadBonus())) ;
        }
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.salary && item.getSalary()!=null) {
            dto.setSalary(salaryConverter.toDto(item.getSalary())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.workloadBonus = value;
        this.prof = value;
        this.salary = value;
    }


    public WorkloadBonusConverter getWorkloadBonusConverter(){
        return this.workloadBonusConverter;
    }
    public void setWorkloadBonusConverter(WorkloadBonusConverter workloadBonusConverter ){
        this.workloadBonusConverter = workloadBonusConverter;
    }
    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public SalaryConverter getSalaryConverter(){
        return this.salaryConverter;
    }
    public void setSalaryConverter(SalaryConverter salaryConverter ){
        this.salaryConverter = salaryConverter;
    }
    public boolean  isWorkloadBonus(){
        return this.workloadBonus;
    }
    public void  setWorkloadBonus(boolean workloadBonus){
        this.workloadBonus = workloadBonus;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isSalary(){
        return this.salary;
    }
    public void  setSalary(boolean salary){
        this.salary = salary;
    }
}
