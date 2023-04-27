package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.WorkloadBonusProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkloadBonusProfHistoryDao extends AbstractHistoryRepository<WorkloadBonusProfHistory,Long> {

}
