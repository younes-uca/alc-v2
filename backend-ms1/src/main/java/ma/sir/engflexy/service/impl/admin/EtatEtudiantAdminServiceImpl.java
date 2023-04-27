package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.EtatEtudiant;
import ma.sir.engflexy.bean.history.EtatEtudiantHistory;
import ma.sir.engflexy.dao.criteria.core.EtatEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.EtatEtudiantDao;
import ma.sir.engflexy.dao.facade.history.EtatEtudiantHistoryDao;
import ma.sir.engflexy.dao.specification.core.EtatEtudiantSpecification;
import ma.sir.engflexy.service.facade.admin.EtatEtudiantAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatEtudiantAdminServiceImpl extends AbstractServiceImpl<EtatEtudiant,EtatEtudiantHistory, EtatEtudiantCriteria, EtatEtudiantHistoryCriteria, EtatEtudiantDao,
EtatEtudiantHistoryDao> implements EtatEtudiantAdminService {


    public EtatEtudiant findByReferenceEntity(EtatEtudiant t){
        return  dao.findByReference(t.getReference());
    }


    public void configure() {
        super.configure(EtatEtudiant.class,EtatEtudiantHistory.class, EtatEtudiantHistoryCriteria.class, EtatEtudiantSpecification.class);
    }

    public EtatEtudiantAdminServiceImpl(EtatEtudiantDao dao, EtatEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}