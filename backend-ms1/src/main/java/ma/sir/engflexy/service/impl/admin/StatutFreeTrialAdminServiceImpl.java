package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.StatutFreeTrial;
import ma.sir.engflexy.bean.history.StatutFreeTrialHistory;
import ma.sir.engflexy.dao.criteria.core.StatutFreeTrialCriteria;
import ma.sir.engflexy.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.StatutFreeTrialDao;
import ma.sir.engflexy.dao.facade.history.StatutFreeTrialHistoryDao;
import ma.sir.engflexy.dao.specification.core.StatutFreeTrialSpecification;
import ma.sir.engflexy.service.facade.admin.StatutFreeTrialAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class StatutFreeTrialAdminServiceImpl extends AbstractServiceImpl<StatutFreeTrial,StatutFreeTrialHistory, StatutFreeTrialCriteria, StatutFreeTrialHistoryCriteria, StatutFreeTrialDao,
StatutFreeTrialHistoryDao> implements StatutFreeTrialAdminService {


    public StatutFreeTrial findByReferenceEntity(StatutFreeTrial t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(StatutFreeTrial.class,StatutFreeTrialHistory.class, StatutFreeTrialHistoryCriteria.class, StatutFreeTrialSpecification.class);
    }

    public StatutFreeTrialAdminServiceImpl(StatutFreeTrialDao dao, StatutFreeTrialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}