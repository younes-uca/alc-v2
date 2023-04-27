package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.VocabularyQuiz;
import ma.sir.engflexy.dao.criteria.core.VocabularyQuizCriteria;
import ma.sir.engflexy.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface VocabularyQuizAdminService extends  IService<VocabularyQuiz,VocabularyQuizCriteria, VocabularyQuizHistoryCriteria>  {

    List<VocabularyQuiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
