package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FreeTrialformule;
import ma.sir.engflexy.bean.history.FreeTrialformuleHistory;
import ma.sir.engflexy.dao.criteria.core.FreeTrialformuleCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FreeTrialformuleDao;
import ma.sir.engflexy.dao.facade.history.FreeTrialformuleHistoryDao;
import ma.sir.engflexy.dao.specification.core.FreeTrialformuleSpecification;
import ma.sir.engflexy.service.facade.admin.FreeTrialformuleAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.InscriptionAdminService ;


import java.util.List;
@Service
public class FreeTrialformuleAdminServiceImpl extends AbstractServiceImpl<FreeTrialformule,FreeTrialformuleHistory, FreeTrialformuleCriteria, FreeTrialformuleHistoryCriteria, FreeTrialformuleDao,
FreeTrialformuleHistoryDao> implements FreeTrialformuleAdminService {


    public FreeTrialformule findByReferenceEntity(FreeTrialformule t){
        return  dao.findByCode(t.getCode());
    }

    public List<FreeTrialformule> findByInscriptionId(Long id){
        return dao.findByInscriptionId(id);
    }
    public int deleteByInscriptionId(Long id){
        return dao.deleteByInscriptionId(id);
    }

    public void configure() {
        super.configure(FreeTrialformule.class,FreeTrialformuleHistory.class, FreeTrialformuleHistoryCriteria.class, FreeTrialformuleSpecification.class);
    }

    @Autowired
    private InscriptionAdminService inscriptionService ;
    public FreeTrialformuleAdminServiceImpl(FreeTrialformuleDao dao, FreeTrialformuleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}