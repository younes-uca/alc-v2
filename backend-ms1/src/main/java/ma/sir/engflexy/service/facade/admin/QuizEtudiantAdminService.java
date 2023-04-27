package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.QuizEtudiant;
import ma.sir.engflexy.dao.criteria.core.QuizEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface QuizEtudiantAdminService extends  IService<QuizEtudiant,QuizEtudiantCriteria, QuizEtudiantHistoryCriteria>  {

    List<QuizEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<QuizEtudiant> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
