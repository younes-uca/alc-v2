package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.QuestionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionHistoryDao extends AbstractHistoryRepository<QuestionHistory,Long> {

}
