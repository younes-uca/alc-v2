package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.CalendrierProf;
import ma.sir.engflexy.bean.history.CalendrierProfHistory;
import ma.sir.engflexy.dao.criteria.core.CalendrierProfCriteria;
import ma.sir.engflexy.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.CalendrierProfDao;
import ma.sir.engflexy.dao.facade.history.CalendrierProfHistoryDao;
import ma.sir.engflexy.dao.specification.core.CalendrierProfSpecification;
import ma.sir.engflexy.service.facade.admin.CalendrierProfAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;
import ma.sir.engflexy.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class CalendrierProfAdminServiceImpl extends AbstractServiceImpl<CalendrierProf,CalendrierProfHistory, CalendrierProfCriteria, CalendrierProfHistoryCriteria, CalendrierProfDao,
CalendrierProfHistoryDao> implements CalendrierProfAdminService {


    public CalendrierProf findByReferenceEntity(CalendrierProf t){
        return  dao.findByRef(t.getRef());
    }

    public List<CalendrierProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<CalendrierProf> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(CalendrierProf.class,CalendrierProfHistory.class, CalendrierProfHistoryCriteria.class, CalendrierProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    public CalendrierProfAdminServiceImpl(CalendrierProfDao dao, CalendrierProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}