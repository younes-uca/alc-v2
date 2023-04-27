package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.ReponseEtudiant;
import ma.sir.engflexy.dao.criteria.core.ReponseEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ReponseEtudiantAdminService extends  IService<ReponseEtudiant,ReponseEtudiantCriteria, ReponseEtudiantHistoryCriteria>  {

    List<ReponseEtudiant> findByReponseId(Long id);
    int deleteByReponseId(Long id);
    List<ReponseEtudiant> findByQuizEtudiantId(Long id);
    int deleteByQuizEtudiantId(Long id);
    List<ReponseEtudiant> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);



}
