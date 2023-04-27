package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.CoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursHistoryDao extends AbstractHistoryRepository<CoursHistory,Long> {

}
