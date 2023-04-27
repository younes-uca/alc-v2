package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.VocabularyHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyHistoryDao extends AbstractHistoryRepository<VocabularyHistory,Long> {

}
