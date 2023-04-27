package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.SessionCoursHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionCoursHistoryDao extends AbstractHistoryRepository<SessionCoursHistory,Long> {

}
