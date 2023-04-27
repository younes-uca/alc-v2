package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.GroupeEtudeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudeHistoryDao extends AbstractHistoryRepository<GroupeEtudeHistory,Long> {

}
