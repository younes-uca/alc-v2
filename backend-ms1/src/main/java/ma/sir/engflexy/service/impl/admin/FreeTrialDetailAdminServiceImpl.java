package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FreeTrialDetail;
import ma.sir.engflexy.bean.history.FreeTrialDetailHistory;
import ma.sir.engflexy.dao.criteria.core.FreeTrialDetailCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FreeTrialDetailDao;
import ma.sir.engflexy.dao.facade.history.FreeTrialDetailHistoryDao;
import ma.sir.engflexy.dao.specification.core.FreeTrialDetailSpecification;
import ma.sir.engflexy.service.facade.admin.FreeTrialDetailAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.EtudiantAdminService ;
import ma.sir.engflexy.service.facade.admin.FreeTrialAdminService ;


import java.util.List;
@Service
public class FreeTrialDetailAdminServiceImpl extends AbstractServiceImpl<FreeTrialDetail,FreeTrialDetailHistory, FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria, FreeTrialDetailDao,
FreeTrialDetailHistoryDao> implements FreeTrialDetailAdminService {



    public List<FreeTrialDetail> findByFreeTrialId(Long id){
        return dao.findByFreeTrialId(id);
    }
    public int deleteByFreeTrialId(Long id){
        return dao.deleteByFreeTrialId(id);
    }
    public List<FreeTrialDetail> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(FreeTrialDetail.class,FreeTrialDetailHistory.class, FreeTrialDetailHistoryCriteria.class, FreeTrialDetailSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private FreeTrialAdminService freeTrialService ;
    public FreeTrialDetailAdminServiceImpl(FreeTrialDetailDao dao, FreeTrialDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

}