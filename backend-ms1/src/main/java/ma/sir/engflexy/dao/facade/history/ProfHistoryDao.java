package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfHistoryDao extends AbstractHistoryRepository<ProfHistory,Long> {

}
