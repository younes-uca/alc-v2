package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.TrancheHoraireProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TrancheHoraireProfHistoryDao extends AbstractHistoryRepository<TrancheHoraireProfHistory,Long> {

}
