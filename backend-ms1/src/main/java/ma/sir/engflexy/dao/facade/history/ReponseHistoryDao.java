package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ReponseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseHistoryDao extends AbstractHistoryRepository<ReponseHistory,Long> {

}
