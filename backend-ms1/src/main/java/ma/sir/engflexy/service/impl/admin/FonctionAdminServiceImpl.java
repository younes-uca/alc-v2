package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Fonction;
import ma.sir.engflexy.bean.history.FonctionHistory;
import ma.sir.engflexy.dao.criteria.core.FonctionCriteria;
import ma.sir.engflexy.dao.criteria.history.FonctionHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FonctionDao;
import ma.sir.engflexy.dao.facade.history.FonctionHistoryDao;
import ma.sir.engflexy.dao.specification.core.FonctionSpecification;
import ma.sir.engflexy.service.facade.admin.FonctionAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FonctionAdminServiceImpl extends AbstractServiceImpl<Fonction,FonctionHistory, FonctionCriteria, FonctionHistoryCriteria, FonctionDao,
FonctionHistoryDao> implements FonctionAdminService {


    public Fonction findByReferenceEntity(Fonction t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Fonction.class,FonctionHistory.class, FonctionHistoryCriteria.class, FonctionSpecification.class);
    }

    public FonctionAdminServiceImpl(FonctionDao dao, FonctionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}