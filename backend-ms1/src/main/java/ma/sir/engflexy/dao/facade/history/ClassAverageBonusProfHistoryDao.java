package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ClassAverageBonusProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAverageBonusProfHistoryDao extends AbstractHistoryRepository<ClassAverageBonusProfHistory,Long> {

}
