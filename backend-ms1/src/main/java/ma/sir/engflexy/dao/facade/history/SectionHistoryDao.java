package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.SectionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionHistoryDao extends AbstractHistoryRepository<SectionHistory,Long> {

}
