package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.GroupeEtudiantDetailHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudiantDetailHistoryDao extends AbstractHistoryRepository<GroupeEtudiantDetailHistory,Long> {

}
