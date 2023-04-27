package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ClassAverageBonusHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAverageBonusHistoryDao extends AbstractHistoryRepository<ClassAverageBonusHistory,Long> {

}
