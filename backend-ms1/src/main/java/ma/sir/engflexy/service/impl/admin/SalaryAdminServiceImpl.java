package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Salary;
import ma.sir.engflexy.bean.history.SalaryHistory;
import ma.sir.engflexy.dao.criteria.core.SalaryCriteria;
import ma.sir.engflexy.dao.criteria.history.SalaryHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.SalaryDao;
import ma.sir.engflexy.dao.facade.history.SalaryHistoryDao;
import ma.sir.engflexy.dao.specification.core.SalarySpecification;
import ma.sir.engflexy.service.facade.admin.SalaryAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class SalaryAdminServiceImpl extends AbstractServiceImpl<Salary,SalaryHistory, SalaryCriteria, SalaryHistoryCriteria, SalaryDao,
SalaryHistoryDao> implements SalaryAdminService {


    public Salary findByReferenceEntity(Salary t){
        return  dao.findByCode(t.getCode());
    }

    public List<Salary> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }

    public void configure() {
        super.configure(Salary.class,SalaryHistory.class, SalaryHistoryCriteria.class, SalarySpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    public SalaryAdminServiceImpl(SalaryDao dao, SalaryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}