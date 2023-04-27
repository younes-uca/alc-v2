package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.CentreHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CentreHistoryDao extends AbstractHistoryRepository<CentreHistory,Long> {

}
