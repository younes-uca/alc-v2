package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FaqHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqHistoryDao extends AbstractHistoryRepository<FaqHistory,Long> {

}
