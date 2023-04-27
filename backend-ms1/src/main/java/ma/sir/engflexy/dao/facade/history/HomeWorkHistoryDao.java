package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.HomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkHistoryDao extends AbstractHistoryRepository<HomeWorkHistory,Long> {

}
