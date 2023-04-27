package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.WorkloadBonus;
import ma.sir.engflexy.bean.history.WorkloadBonusHistory;
import ma.sir.engflexy.dao.criteria.core.WorkloadBonusCriteria;
import ma.sir.engflexy.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.WorkloadBonusDao;
import ma.sir.engflexy.dao.facade.history.WorkloadBonusHistoryDao;
import ma.sir.engflexy.dao.specification.core.WorkloadBonusSpecification;
import ma.sir.engflexy.service.facade.admin.WorkloadBonusAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class WorkloadBonusAdminServiceImpl extends AbstractServiceImpl<WorkloadBonus,WorkloadBonusHistory, WorkloadBonusCriteria, WorkloadBonusHistoryCriteria, WorkloadBonusDao,
WorkloadBonusHistoryDao> implements WorkloadBonusAdminService {


    public WorkloadBonus findByReferenceEntity(WorkloadBonus t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(WorkloadBonus.class,WorkloadBonusHistory.class, WorkloadBonusHistoryCriteria.class, WorkloadBonusSpecification.class);
    }

    public WorkloadBonusAdminServiceImpl(WorkloadBonusDao dao, WorkloadBonusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}