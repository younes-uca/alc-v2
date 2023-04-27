package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FaqTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqTypeHistoryDao extends AbstractHistoryRepository<FaqTypeHistory,Long> {

}
