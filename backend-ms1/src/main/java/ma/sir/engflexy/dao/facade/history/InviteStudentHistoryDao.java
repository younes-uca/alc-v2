package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.InviteStudentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InviteStudentHistoryDao extends AbstractHistoryRepository<InviteStudentHistory,Long> {

}
