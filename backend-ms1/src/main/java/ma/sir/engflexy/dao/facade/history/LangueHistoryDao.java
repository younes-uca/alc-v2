package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.LangueHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LangueHistoryDao extends AbstractHistoryRepository<LangueHistory,Long> {

}
