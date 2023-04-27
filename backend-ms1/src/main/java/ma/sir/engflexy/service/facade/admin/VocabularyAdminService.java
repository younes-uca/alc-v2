package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Vocabulary;
import ma.sir.engflexy.dao.criteria.core.VocabularyCriteria;
import ma.sir.engflexy.dao.criteria.history.VocabularyHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface VocabularyAdminService extends  IService<Vocabulary,VocabularyCriteria, VocabularyHistoryCriteria>  {

    List<Vocabulary> findBySectionId(Long id);
    int deleteBySectionId(Long id);
    List<Vocabulary> findByVocabularyQuizId(Long id);
    int deleteByVocabularyQuizId(Long id);



}
