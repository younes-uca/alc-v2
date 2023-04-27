package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.InteretEtudiant;
import ma.sir.engflexy.bean.history.InteretEtudiantHistory;
import ma.sir.engflexy.dao.criteria.core.InteretEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.InteretEtudiantDao;
import ma.sir.engflexy.dao.facade.history.InteretEtudiantHistoryDao;
import ma.sir.engflexy.dao.specification.core.InteretEtudiantSpecification;
import ma.sir.engflexy.service.facade.admin.InteretEtudiantAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class InteretEtudiantAdminServiceImpl extends AbstractServiceImpl<InteretEtudiant,InteretEtudiantHistory, InteretEtudiantCriteria, InteretEtudiantHistoryCriteria, InteretEtudiantDao,
InteretEtudiantHistoryDao> implements InteretEtudiantAdminService {


    public InteretEtudiant findByReferenceEntity(InteretEtudiant t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(InteretEtudiant.class,InteretEtudiantHistory.class, InteretEtudiantHistoryCriteria.class, InteretEtudiantSpecification.class);
    }

    public InteretEtudiantAdminServiceImpl(InteretEtudiantDao dao, InteretEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}