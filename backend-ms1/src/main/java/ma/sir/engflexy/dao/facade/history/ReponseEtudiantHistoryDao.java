package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ReponseEtudiantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseEtudiantHistoryDao extends AbstractHistoryRepository<ReponseEtudiantHistory,Long> {

}
