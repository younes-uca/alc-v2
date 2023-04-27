package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.QuizEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizEtudiantHistoryDao extends AbstractHistoryRepository<QuizEtudiantHistory,Long> {

}
