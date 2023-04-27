package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.EtatEtudiantScheduleHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantScheduleHistoryDao extends AbstractHistoryRepository<EtatEtudiantScheduleHistory,Long> {

}
