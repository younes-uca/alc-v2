package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.EtudiantReview;
import ma.sir.engflexy.dao.criteria.core.EtudiantReviewCriteria;
import ma.sir.engflexy.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface EtudiantReviewAdminService extends  IService<EtudiantReview,EtudiantReviewCriteria, EtudiantReviewHistoryCriteria>  {

    List<EtudiantReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<EtudiantReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<EtudiantReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
