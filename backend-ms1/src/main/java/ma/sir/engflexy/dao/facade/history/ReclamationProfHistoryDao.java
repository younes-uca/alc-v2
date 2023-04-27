package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ReclamationProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationProfHistoryDao extends AbstractHistoryRepository<ReclamationProfHistory,Long> {

}
