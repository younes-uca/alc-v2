package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.TypeReclamationEtudiant;
import ma.sir.engflexy.bean.history.TypeReclamationEtudiantHistory;
import ma.sir.engflexy.dao.criteria.core.TypeReclamationEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.TypeReclamationEtudiantDao;
import ma.sir.engflexy.dao.facade.history.TypeReclamationEtudiantHistoryDao;
import ma.sir.engflexy.dao.specification.core.TypeReclamationEtudiantSpecification;
import ma.sir.engflexy.service.facade.admin.TypeReclamationEtudiantAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeReclamationEtudiantAdminServiceImpl extends AbstractServiceImpl<TypeReclamationEtudiant,TypeReclamationEtudiantHistory, TypeReclamationEtudiantCriteria, TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantDao,
TypeReclamationEtudiantHistoryDao> implements TypeReclamationEtudiantAdminService {


    public TypeReclamationEtudiant findByReferenceEntity(TypeReclamationEtudiant t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeReclamationEtudiant.class,TypeReclamationEtudiantHistory.class, TypeReclamationEtudiantHistoryCriteria.class, TypeReclamationEtudiantSpecification.class);
    }

    public TypeReclamationEtudiantAdminServiceImpl(TypeReclamationEtudiantDao dao, TypeReclamationEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}