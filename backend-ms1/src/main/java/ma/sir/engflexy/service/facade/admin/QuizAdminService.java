package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Quiz;
import ma.sir.engflexy.dao.criteria.core.QuizCriteria;
import ma.sir.engflexy.dao.criteria.history.QuizHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface QuizAdminService extends  IService<Quiz,QuizCriteria, QuizHistoryCriteria>  {

    List<Quiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
