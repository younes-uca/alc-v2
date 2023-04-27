package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Langue;
import ma.sir.engflexy.bean.history.LangueHistory;
import ma.sir.engflexy.dao.criteria.core.LangueCriteria;
import ma.sir.engflexy.dao.criteria.history.LangueHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.LangueDao;
import ma.sir.engflexy.dao.facade.history.LangueHistoryDao;
import ma.sir.engflexy.dao.specification.core.LangueSpecification;
import ma.sir.engflexy.service.facade.admin.LangueAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class LangueAdminServiceImpl extends AbstractServiceImpl<Langue,LangueHistory, LangueCriteria, LangueHistoryCriteria, LangueDao,
LangueHistoryDao> implements LangueAdminService {


    public Langue findByReferenceEntity(Langue t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(Langue.class,LangueHistory.class, LangueHistoryCriteria.class, LangueSpecification.class);
    }

    public LangueAdminServiceImpl(LangueDao dao, LangueHistoryDao historyDao) {
        super(dao, historyDao);
    }

}