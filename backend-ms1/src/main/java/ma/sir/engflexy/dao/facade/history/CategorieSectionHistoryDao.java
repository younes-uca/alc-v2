package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.CategorieSectionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieSectionHistoryDao extends AbstractHistoryRepository<CategorieSectionHistory,Long> {

}
