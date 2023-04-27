package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FaqEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqEtudiantHistoryDao extends AbstractHistoryRepository<FaqEtudiantHistory,Long> {

}
