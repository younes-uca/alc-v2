package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.InscriptionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionHistoryDao extends AbstractHistoryRepository<InscriptionHistory,Long> {

}
