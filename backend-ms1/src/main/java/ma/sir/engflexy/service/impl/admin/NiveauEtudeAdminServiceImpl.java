package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.NiveauEtude;
import ma.sir.engflexy.bean.history.NiveauEtudeHistory;
import ma.sir.engflexy.dao.criteria.core.NiveauEtudeCriteria;
import ma.sir.engflexy.dao.criteria.history.NiveauEtudeHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.NiveauEtudeDao;
import ma.sir.engflexy.dao.facade.history.NiveauEtudeHistoryDao;
import ma.sir.engflexy.dao.specification.core.NiveauEtudeSpecification;
import ma.sir.engflexy.service.facade.admin.NiveauEtudeAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NiveauEtudeAdminServiceImpl extends AbstractServiceImpl<NiveauEtude,NiveauEtudeHistory, NiveauEtudeCriteria, NiveauEtudeHistoryCriteria, NiveauEtudeDao,
NiveauEtudeHistoryDao> implements NiveauEtudeAdminService {


    public NiveauEtude findByReferenceEntity(NiveauEtude t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(NiveauEtude.class,NiveauEtudeHistory.class, NiveauEtudeHistoryCriteria.class, NiveauEtudeSpecification.class);
    }

    public NiveauEtudeAdminServiceImpl(NiveauEtudeDao dao, NiveauEtudeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}