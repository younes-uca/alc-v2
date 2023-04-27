package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.PackStudentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PackStudentHistoryDao extends AbstractHistoryRepository<PackStudentHistory,Long> {

}
