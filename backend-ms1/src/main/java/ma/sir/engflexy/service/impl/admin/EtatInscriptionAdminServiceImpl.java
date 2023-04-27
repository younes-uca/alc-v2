package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.EtatInscription;
import ma.sir.engflexy.bean.history.EtatInscriptionHistory;
import ma.sir.engflexy.dao.criteria.core.EtatInscriptionCriteria;
import ma.sir.engflexy.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.EtatInscriptionDao;
import ma.sir.engflexy.dao.facade.history.EtatInscriptionHistoryDao;
import ma.sir.engflexy.dao.specification.core.EtatInscriptionSpecification;
import ma.sir.engflexy.service.facade.admin.EtatInscriptionAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatInscriptionAdminServiceImpl extends AbstractServiceImpl<EtatInscription,EtatInscriptionHistory, EtatInscriptionCriteria, EtatInscriptionHistoryCriteria, EtatInscriptionDao,
EtatInscriptionHistoryDao> implements EtatInscriptionAdminService {


    public EtatInscription findByReferenceEntity(EtatInscription t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(EtatInscription.class,EtatInscriptionHistory.class, EtatInscriptionHistoryCriteria.class, EtatInscriptionSpecification.class);
    }

    public EtatInscriptionAdminServiceImpl(EtatInscriptionDao dao, EtatInscriptionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}