package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.ContactHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactHistoryDao extends AbstractHistoryRepository<ContactHistory,Long> {

}
