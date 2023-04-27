package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.ReclamationProf;
import ma.sir.engflexy.bean.history.ReclamationProfHistory;
import ma.sir.engflexy.dao.criteria.core.ReclamationProfCriteria;
import ma.sir.engflexy.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.ReclamationProfDao;
import ma.sir.engflexy.dao.facade.history.ReclamationProfHistoryDao;
import ma.sir.engflexy.dao.specification.core.ReclamationProfSpecification;
import ma.sir.engflexy.service.facade.admin.ReclamationProfAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;
import ma.sir.engflexy.service.facade.admin.TypeReclamationProfAdminService ;
import ma.sir.engflexy.service.facade.admin.AdminAdminService ;


import java.util.List;
@Service
public class ReclamationProfAdminServiceImpl extends AbstractServiceImpl<ReclamationProf,ReclamationProfHistory, ReclamationProfCriteria, ReclamationProfHistoryCriteria, ReclamationProfDao,
ReclamationProfHistoryDao> implements ReclamationProfAdminService {


    public ReclamationProf findByReferenceEntity(ReclamationProf t){
        return  dao.findByReference(t.getReference());
    }

    public List<ReclamationProf> findByAdminId(Long id){
        return dao.findByAdminId(id);
    }
    public int deleteByAdminId(Long id){
        return dao.deleteByAdminId(id);
    }
    public List<ReclamationProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ReclamationProf> findByTypeReclamationProfId(Long id){
        return dao.findByTypeReclamationProfId(id);
    }
    public int deleteByTypeReclamationProfId(Long id){
        return dao.deleteByTypeReclamationProfId(id);
    }

    public void configure() {
        super.configure(ReclamationProf.class,ReclamationProfHistory.class, ReclamationProfHistoryCriteria.class, ReclamationProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private TypeReclamationProfAdminService typeReclamationProfService ;
    @Autowired
    private AdminAdminService adminService ;
    public ReclamationProfAdminServiceImpl(ReclamationProfDao dao, ReclamationProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}