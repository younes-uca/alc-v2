package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ResultatHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatHomeWorkHistoryDao extends AbstractHistoryRepository<ResultatHomeWorkHistory,Long> {

}
