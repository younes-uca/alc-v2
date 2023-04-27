package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Salary;
import ma.sir.engflexy.dao.criteria.core.SalaryCriteria;
import ma.sir.engflexy.dao.criteria.history.SalaryHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface SalaryAdminService extends  IService<Salary,SalaryCriteria, SalaryHistoryCriteria>  {

    List<Salary> findByProfId(Long id);
    int deleteByProfId(Long id);



}
