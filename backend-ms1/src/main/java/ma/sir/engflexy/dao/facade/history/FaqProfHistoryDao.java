package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FaqProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqProfHistoryDao extends AbstractHistoryRepository<FaqProfHistory,Long> {

}
