package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.EtatCours;
import ma.sir.engflexy.bean.history.EtatCoursHistory;
import ma.sir.engflexy.dao.criteria.core.EtatCoursCriteria;
import ma.sir.engflexy.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.EtatCoursDao;
import ma.sir.engflexy.dao.facade.history.EtatCoursHistoryDao;
import ma.sir.engflexy.dao.specification.core.EtatCoursSpecification;
import ma.sir.engflexy.service.facade.admin.EtatCoursAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatCoursAdminServiceImpl extends AbstractServiceImpl<EtatCours,EtatCoursHistory, EtatCoursCriteria, EtatCoursHistoryCriteria, EtatCoursDao,
EtatCoursHistoryDao> implements EtatCoursAdminService {


    public EtatCours findByReferenceEntity(EtatCours t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EtatCours.class,EtatCoursHistory.class, EtatCoursHistoryCriteria.class, EtatCoursSpecification.class);
    }

    public EtatCoursAdminServiceImpl(EtatCoursDao dao, EtatCoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}