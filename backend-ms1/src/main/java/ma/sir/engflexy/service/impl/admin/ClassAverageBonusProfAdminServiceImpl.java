package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.ClassAverageBonusProf;
import ma.sir.engflexy.bean.history.ClassAverageBonusProfHistory;
import ma.sir.engflexy.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.sir.engflexy.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.ClassAverageBonusProfDao;
import ma.sir.engflexy.dao.facade.history.ClassAverageBonusProfHistoryDao;
import ma.sir.engflexy.dao.specification.core.ClassAverageBonusProfSpecification;
import ma.sir.engflexy.service.facade.admin.ClassAverageBonusProfAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;
import ma.sir.engflexy.service.facade.admin.SalaryAdminService ;


import java.util.List;
@Service
public class ClassAverageBonusProfAdminServiceImpl extends AbstractServiceImpl<ClassAverageBonusProf,ClassAverageBonusProfHistory, ClassAverageBonusProfCriteria, ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfDao,
ClassAverageBonusProfHistoryDao> implements ClassAverageBonusProfAdminService {



    public List<ClassAverageBonusProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ClassAverageBonusProf> findBySalaryId(Long id){
        return dao.findBySalaryId(id);
    }
    public int deleteBySalaryId(Long id){
        return dao.deleteBySalaryId(id);
    }

    public void configure() {
        super.configure(ClassAverageBonusProf.class,ClassAverageBonusProfHistory.class, ClassAverageBonusProfHistoryCriteria.class, ClassAverageBonusProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private SalaryAdminService salaryService ;
    public ClassAverageBonusProfAdminServiceImpl(ClassAverageBonusProfDao dao, ClassAverageBonusProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}