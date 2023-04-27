package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.QuizHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizHistoryDao extends AbstractHistoryRepository<QuizHistory,Long> {

}
