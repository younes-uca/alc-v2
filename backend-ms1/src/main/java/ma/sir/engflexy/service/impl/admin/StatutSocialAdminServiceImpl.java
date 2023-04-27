package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.StatutSocial;
import ma.sir.engflexy.bean.history.StatutSocialHistory;
import ma.sir.engflexy.dao.criteria.core.StatutSocialCriteria;
import ma.sir.engflexy.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.StatutSocialDao;
import ma.sir.engflexy.dao.facade.history.StatutSocialHistoryDao;
import ma.sir.engflexy.dao.specification.core.StatutSocialSpecification;
import ma.sir.engflexy.service.facade.admin.StatutSocialAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class StatutSocialAdminServiceImpl extends AbstractServiceImpl<StatutSocial,StatutSocialHistory, StatutSocialCriteria, StatutSocialHistoryCriteria, StatutSocialDao,
StatutSocialHistoryDao> implements StatutSocialAdminService {


    public StatutSocial findByReferenceEntity(StatutSocial t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(StatutSocial.class,StatutSocialHistory.class, StatutSocialHistoryCriteria.class, StatutSocialSpecification.class);
    }

    public StatutSocialAdminServiceImpl(StatutSocialDao dao, StatutSocialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}