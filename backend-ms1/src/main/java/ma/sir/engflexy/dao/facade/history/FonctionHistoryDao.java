package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FonctionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionHistoryDao extends AbstractHistoryRepository<FonctionHistory,Long> {

}
