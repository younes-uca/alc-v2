package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.EtatInscriptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatInscriptionHistoryDao extends AbstractHistoryRepository<EtatInscriptionHistory,Long> {

}
