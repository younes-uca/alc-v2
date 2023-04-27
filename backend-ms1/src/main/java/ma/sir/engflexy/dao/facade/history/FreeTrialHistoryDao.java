package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FreeTrialHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialHistoryDao extends AbstractHistoryRepository<FreeTrialHistory,Long> {

}
