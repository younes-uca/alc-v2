package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.NiveauEtudeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauEtudeHistoryDao extends AbstractHistoryRepository<NiveauEtudeHistory,Long> {

}
