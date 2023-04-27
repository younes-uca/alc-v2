package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.SectionItemHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionItemHistoryDao extends AbstractHistoryRepository<SectionItemHistory,Long> {

}
