package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FreeTrialConfiguration;
import ma.sir.engflexy.bean.history.FreeTrialConfigurationHistory;
import ma.sir.engflexy.dao.criteria.core.FreeTrialConfigurationCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FreeTrialConfigurationDao;
import ma.sir.engflexy.dao.facade.history.FreeTrialConfigurationHistoryDao;
import ma.sir.engflexy.dao.specification.core.FreeTrialConfigurationSpecification;
import ma.sir.engflexy.service.facade.admin.FreeTrialConfigurationAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialConfigurationAdminServiceImpl extends AbstractServiceImpl<FreeTrialConfiguration,FreeTrialConfigurationHistory, FreeTrialConfigurationCriteria, FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationDao,
FreeTrialConfigurationHistoryDao> implements FreeTrialConfigurationAdminService {




    public void configure() {
        super.configure(FreeTrialConfiguration.class,FreeTrialConfigurationHistory.class, FreeTrialConfigurationHistoryCriteria.class, FreeTrialConfigurationSpecification.class);
    }

    public FreeTrialConfigurationAdminServiceImpl(FreeTrialConfigurationDao dao, FreeTrialConfigurationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}