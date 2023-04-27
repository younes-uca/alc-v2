package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.WorkloadBonusProf;
import ma.sir.engflexy.bean.history.WorkloadBonusProfHistory;
import ma.sir.engflexy.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.sir.engflexy.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.WorkloadBonusProfDao;
import ma.sir.engflexy.dao.facade.history.WorkloadBonusProfHistoryDao;
import ma.sir.engflexy.dao.specification.core.WorkloadBonusProfSpecification;
import ma.sir.engflexy.service.facade.admin.WorkloadBonusProfAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.WorkloadBonusAdminService ;
import ma.sir.engflexy.service.facade.admin.ProfAdminService ;
import ma.sir.engflexy.service.facade.admin.SalaryAdminService ;


import java.util.List;
@Service
public class WorkloadBonusProfAdminServiceImpl extends AbstractServiceImpl<WorkloadBonusProf,WorkloadBonusProfHistory, WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria, WorkloadBonusProfDao,
WorkloadBonusProfHistoryDao> implements WorkloadBonusProfAdminService {



    public List<WorkloadBonusProf> findByWorkloadBonusId(Long id){
        return dao.findByWorkloadBonusId(id);
    }
    public int deleteByWorkloadBonusId(Long id){
        return dao.deleteByWorkloadBonusId(id);
    }
    public List<WorkloadBonusProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<WorkloadBonusProf> findBySalaryId(Long id){
        return dao.findBySalaryId(id);
    }
    public int deleteBySalaryId(Long id){
        return dao.deleteBySalaryId(id);
    }

    public void configure() {
        super.configure(WorkloadBonusProf.class,WorkloadBonusProfHistory.class, WorkloadBonusProfHistoryCriteria.class, WorkloadBonusProfSpecification.class);
    }

    @Autowired
    private WorkloadBonusAdminService workloadBonusService ;
    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private SalaryAdminService salaryService ;
    public WorkloadBonusProfAdminServiceImpl(WorkloadBonusProfDao dao, WorkloadBonusProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}