package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.EtudiantCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantCoursHistoryDao extends AbstractHistoryRepository<EtudiantCoursHistory,Long> {

}
