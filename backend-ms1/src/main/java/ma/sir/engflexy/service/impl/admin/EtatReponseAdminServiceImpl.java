package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.EtatReponse;
import ma.sir.engflexy.bean.history.EtatReponseHistory;
import ma.sir.engflexy.dao.criteria.core.EtatReponseCriteria;
import ma.sir.engflexy.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.EtatReponseDao;
import ma.sir.engflexy.dao.facade.history.EtatReponseHistoryDao;
import ma.sir.engflexy.dao.specification.core.EtatReponseSpecification;
import ma.sir.engflexy.service.facade.admin.EtatReponseAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatReponseAdminServiceImpl extends AbstractServiceImpl<EtatReponse,EtatReponseHistory, EtatReponseCriteria, EtatReponseHistoryCriteria, EtatReponseDao,
EtatReponseHistoryDao> implements EtatReponseAdminService {


    public EtatReponse findByReferenceEntity(EtatReponse t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EtatReponse.class,EtatReponseHistory.class, EtatReponseHistoryCriteria.class, EtatReponseSpecification.class);
    }

    public EtatReponseAdminServiceImpl(EtatReponseDao dao, EtatReponseHistoryDao historyDao) {
        super(dao, historyDao);
    }

}