package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.EtudiantCours;
import ma.sir.engflexy.bean.history.EtudiantCoursHistory;
import ma.sir.engflexy.dao.criteria.core.EtudiantCoursCriteria;
import ma.sir.engflexy.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.EtudiantCoursDao;
import ma.sir.engflexy.dao.facade.history.EtudiantCoursHistoryDao;
import ma.sir.engflexy.dao.specification.core.EtudiantCoursSpecification;
import ma.sir.engflexy.service.facade.admin.EtudiantCoursAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;
import ma.sir.engflexy.service.facade.admin.EtudiantAdminService ;
import ma.sir.engflexy.service.facade.admin.CoursAdminService ;


import java.util.List;
@Service
public class EtudiantCoursAdminServiceImpl extends AbstractServiceImpl<EtudiantCours,EtudiantCoursHistory, EtudiantCoursCriteria, EtudiantCoursHistoryCriteria, EtudiantCoursDao,
EtudiantCoursHistoryDao> implements EtudiantCoursAdminService {



    public List<EtudiantCours> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<EtudiantCours> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<EtudiantCours> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }

    public void configure() {
        super.configure(EtudiantCours.class,EtudiantCoursHistory.class, EtudiantCoursHistoryCriteria.class, EtudiantCoursSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private CoursAdminService coursService ;
    public EtudiantCoursAdminServiceImpl(EtudiantCoursDao dao, EtudiantCoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}