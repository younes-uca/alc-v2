package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.ProfReview;
import ma.sir.engflexy.bean.history.ProfReviewHistory;
import ma.sir.engflexy.dao.criteria.core.ProfReviewCriteria;
import ma.sir.engflexy.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.ProfReviewDao;
import ma.sir.engflexy.dao.facade.history.ProfReviewHistoryDao;
import ma.sir.engflexy.dao.specification.core.ProfReviewSpecification;
import ma.sir.engflexy.service.facade.admin.ProfReviewAdminService;
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
public class ProfReviewAdminServiceImpl extends AbstractServiceImpl<ProfReview,ProfReviewHistory, ProfReviewCriteria, ProfReviewHistoryCriteria, ProfReviewDao,
ProfReviewHistoryDao> implements ProfReviewAdminService {



    public List<ProfReview> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<ProfReview> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ProfReview> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }

    public void configure() {
        super.configure(ProfReview.class,ProfReviewHistory.class, ProfReviewHistoryCriteria.class, ProfReviewSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private CoursAdminService coursService ;
    public ProfReviewAdminServiceImpl(ProfReviewDao dao, ProfReviewHistoryDao historyDao) {
        super(dao, historyDao);
    }

}