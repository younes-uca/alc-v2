package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.EtatEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantHistoryDao extends AbstractHistoryRepository<EtatEtudiantHistory,Long> {

}
