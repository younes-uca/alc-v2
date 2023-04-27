package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ReponseEtudiantHomeWorkHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseEtudiantHomeWorkHistoryDao extends AbstractHistoryRepository<ReponseEtudiantHomeWorkHistory,Long> {

}
