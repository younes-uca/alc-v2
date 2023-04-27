package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.ReponseEtudiantHomeWork;
import ma.sir.engflexy.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.sir.engflexy.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ReponseEtudiantHomeWorkAdminService extends  IService<ReponseEtudiantHomeWork,ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria>  {

    List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(Long id);
    int deleteByHoweWorkQSTReponseId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(Long id);
    int deleteByHomeWorkEtudiantId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);



}
