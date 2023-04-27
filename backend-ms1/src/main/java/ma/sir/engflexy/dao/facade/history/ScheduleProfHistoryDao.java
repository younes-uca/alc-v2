package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ScheduleProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleProfHistoryDao extends AbstractHistoryRepository<ScheduleProfHistory,Long> {

}
