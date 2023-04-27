package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ProfReviewHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfReviewHistoryDao extends AbstractHistoryRepository<ProfReviewHistory,Long> {

}
