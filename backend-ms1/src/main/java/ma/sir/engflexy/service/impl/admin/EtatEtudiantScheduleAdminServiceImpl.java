package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.EtatEtudiantSchedule;
import ma.sir.engflexy.bean.history.EtatEtudiantScheduleHistory;
import ma.sir.engflexy.dao.criteria.core.EtatEtudiantScheduleCriteria;
import ma.sir.engflexy.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.EtatEtudiantScheduleDao;
import ma.sir.engflexy.dao.facade.history.EtatEtudiantScheduleHistoryDao;
import ma.sir.engflexy.dao.specification.core.EtatEtudiantScheduleSpecification;
import ma.sir.engflexy.service.facade.admin.EtatEtudiantScheduleAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatEtudiantScheduleAdminServiceImpl extends AbstractServiceImpl<EtatEtudiantSchedule,EtatEtudiantScheduleHistory, EtatEtudiantScheduleCriteria, EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleDao,
EtatEtudiantScheduleHistoryDao> implements EtatEtudiantScheduleAdminService {


    public EtatEtudiantSchedule findByReferenceEntity(EtatEtudiantSchedule t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(EtatEtudiantSchedule.class,EtatEtudiantScheduleHistory.class, EtatEtudiantScheduleHistoryCriteria.class, EtatEtudiantScheduleSpecification.class);
    }

    public EtatEtudiantScheduleAdminServiceImpl(EtatEtudiantScheduleDao dao, EtatEtudiantScheduleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}