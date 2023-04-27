package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.EtudiantReview;
import ma.sir.engflexy.bean.history.EtudiantReviewHistory;
import ma.sir.engflexy.dao.criteria.core.EtudiantReviewCriteria;
import ma.sir.engflexy.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.EtudiantReviewDao;
import ma.sir.engflexy.dao.facade.history.EtudiantReviewHistoryDao;
import ma.sir.engflexy.dao.specification.core.EtudiantReviewSpecification;
import ma.sir.engflexy.service.facade.admin.EtudiantReviewAdminService;
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
public class EtudiantReviewAdminServiceImpl extends AbstractServiceImpl<EtudiantReview,EtudiantReviewHistory, EtudiantReviewCriteria, EtudiantReviewHistoryCriteria, EtudiantReviewDao,
EtudiantReviewHistoryDao> implements EtudiantReviewAdminService {



    public List<EtudiantReview> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<EtudiantReview> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<EtudiantReview> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }

    public void configure() {
        super.configure(EtudiantReview.class,EtudiantReviewHistory.class, EtudiantReviewHistoryCriteria.class, EtudiantReviewSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private CoursAdminService coursService ;
    public EtudiantReviewAdminServiceImpl(EtudiantReviewDao dao, EtudiantReviewHistoryDao historyDao) {
        super(dao, historyDao);
    }

}