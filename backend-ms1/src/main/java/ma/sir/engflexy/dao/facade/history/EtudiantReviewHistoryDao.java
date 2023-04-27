package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.EtudiantReviewHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantReviewHistoryDao extends AbstractHistoryRepository<EtudiantReviewHistory,Long> {

}
