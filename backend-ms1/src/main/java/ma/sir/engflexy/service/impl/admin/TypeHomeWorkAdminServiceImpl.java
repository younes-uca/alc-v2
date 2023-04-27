package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.TypeHomeWork;
import ma.sir.engflexy.bean.history.TypeHomeWorkHistory;
import ma.sir.engflexy.dao.criteria.core.TypeHomeWorkCriteria;
import ma.sir.engflexy.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.TypeHomeWorkDao;
import ma.sir.engflexy.dao.facade.history.TypeHomeWorkHistoryDao;
import ma.sir.engflexy.dao.specification.core.TypeHomeWorkSpecification;
import ma.sir.engflexy.service.facade.admin.TypeHomeWorkAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeHomeWorkAdminServiceImpl extends AbstractServiceImpl<TypeHomeWork,TypeHomeWorkHistory, TypeHomeWorkCriteria, TypeHomeWorkHistoryCriteria, TypeHomeWorkDao,
TypeHomeWorkHistoryDao> implements TypeHomeWorkAdminService {


    public TypeHomeWork findByReferenceEntity(TypeHomeWork t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeHomeWork.class,TypeHomeWorkHistory.class, TypeHomeWorkHistoryCriteria.class, TypeHomeWorkSpecification.class);
    }

    public TypeHomeWorkAdminServiceImpl(TypeHomeWorkDao dao, TypeHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}