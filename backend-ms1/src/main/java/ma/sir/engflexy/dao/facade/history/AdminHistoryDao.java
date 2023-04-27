package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.AdminHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminHistoryDao extends AbstractHistoryRepository<AdminHistory,Long> {

}
