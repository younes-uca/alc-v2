package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.PriceHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceHistoryDao extends AbstractHistoryRepository<PriceHistory,Long> {

}
