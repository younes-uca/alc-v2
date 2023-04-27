package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FreeTrialformuleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialformuleHistoryDao extends AbstractHistoryRepository<FreeTrialformuleHistory,Long> {

}
