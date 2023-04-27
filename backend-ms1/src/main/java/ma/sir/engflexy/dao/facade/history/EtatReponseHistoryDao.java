package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.EtatReponseHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatReponseHistoryDao extends AbstractHistoryRepository<EtatReponseHistory,Long> {

}
