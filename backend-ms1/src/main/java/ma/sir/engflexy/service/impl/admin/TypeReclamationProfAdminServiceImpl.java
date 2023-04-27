package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.TypeReclamationProf;
import ma.sir.engflexy.bean.history.TypeReclamationProfHistory;
import ma.sir.engflexy.dao.criteria.core.TypeReclamationProfCriteria;
import ma.sir.engflexy.dao.criteria.history.TypeReclamationProfHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.TypeReclamationProfDao;
import ma.sir.engflexy.dao.facade.history.TypeReclamationProfHistoryDao;
import ma.sir.engflexy.dao.specification.core.TypeReclamationProfSpecification;
import ma.sir.engflexy.service.facade.admin.TypeReclamationProfAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeReclamationProfAdminServiceImpl extends AbstractServiceImpl<TypeReclamationProf,TypeReclamationProfHistory, TypeReclamationProfCriteria, TypeReclamationProfHistoryCriteria, TypeReclamationProfDao,
TypeReclamationProfHistoryDao> implements TypeReclamationProfAdminService {


    public TypeReclamationProf findByReferenceEntity(TypeReclamationProf t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeReclamationProf.class,TypeReclamationProfHistory.class, TypeReclamationProfHistoryCriteria.class, TypeReclamationProfSpecification.class);
    }

    public TypeReclamationProfAdminServiceImpl(TypeReclamationProfDao dao, TypeReclamationProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}