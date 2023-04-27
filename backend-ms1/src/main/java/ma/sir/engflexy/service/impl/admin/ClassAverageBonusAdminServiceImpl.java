package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.ClassAverageBonus;
import ma.sir.engflexy.bean.history.ClassAverageBonusHistory;
import ma.sir.engflexy.dao.criteria.core.ClassAverageBonusCriteria;
import ma.sir.engflexy.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.ClassAverageBonusDao;
import ma.sir.engflexy.dao.facade.history.ClassAverageBonusHistoryDao;
import ma.sir.engflexy.dao.specification.core.ClassAverageBonusSpecification;
import ma.sir.engflexy.service.facade.admin.ClassAverageBonusAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ClassAverageBonusAdminServiceImpl extends AbstractServiceImpl<ClassAverageBonus,ClassAverageBonusHistory, ClassAverageBonusCriteria, ClassAverageBonusHistoryCriteria, ClassAverageBonusDao,
ClassAverageBonusHistoryDao> implements ClassAverageBonusAdminService {


    public ClassAverageBonus findByReferenceEntity(ClassAverageBonus t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(ClassAverageBonus.class,ClassAverageBonusHistory.class, ClassAverageBonusHistoryCriteria.class, ClassAverageBonusSpecification.class);
    }

    public ClassAverageBonusAdminServiceImpl(ClassAverageBonusDao dao, ClassAverageBonusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}