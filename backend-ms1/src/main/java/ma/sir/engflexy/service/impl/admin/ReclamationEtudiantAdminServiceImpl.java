package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.ReclamationEtudiant;
import ma.sir.engflexy.bean.history.ReclamationEtudiantHistory;
import ma.sir.engflexy.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.ReclamationEtudiantDao;
import ma.sir.engflexy.dao.facade.history.ReclamationEtudiantHistoryDao;
import ma.sir.engflexy.dao.specification.core.ReclamationEtudiantSpecification;
import ma.sir.engflexy.service.facade.admin.ReclamationEtudiantAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.TypeReclamationEtudiantAdminService ;


import java.util.List;
@Service
public class ReclamationEtudiantAdminServiceImpl extends AbstractServiceImpl<ReclamationEtudiant,ReclamationEtudiantHistory, ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria, ReclamationEtudiantDao,
ReclamationEtudiantHistoryDao> implements ReclamationEtudiantAdminService {


    public ReclamationEtudiant findByReferenceEntity(ReclamationEtudiant t){
        return  dao.findByReference(t.getReference());
    }

    public List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id){
        return dao.findByTypeReclamationEtudiantId(id);
    }
    public int deleteByTypeReclamationEtudiantId(Long id){
        return dao.deleteByTypeReclamationEtudiantId(id);
    }

    public void configure() {
        super.configure(ReclamationEtudiant.class,ReclamationEtudiantHistory.class, ReclamationEtudiantHistoryCriteria.class, ReclamationEtudiantSpecification.class);
    }

    @Autowired
    private TypeReclamationEtudiantAdminService typeReclamationEtudiantService ;
    public ReclamationEtudiantAdminServiceImpl(ReclamationEtudiantDao dao, ReclamationEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}