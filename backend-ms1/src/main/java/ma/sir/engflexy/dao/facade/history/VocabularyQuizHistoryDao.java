package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.VocabularyQuizHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyQuizHistoryDao extends AbstractHistoryRepository<VocabularyQuizHistory,Long> {

}
