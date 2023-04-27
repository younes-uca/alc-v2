package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ParcoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcoursHistoryDao extends AbstractHistoryRepository<ParcoursHistory,Long> {

}
