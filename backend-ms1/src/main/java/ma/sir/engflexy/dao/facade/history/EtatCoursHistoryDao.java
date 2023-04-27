package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.EtatCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatCoursHistoryDao extends AbstractHistoryRepository<EtatCoursHistory,Long> {

}
