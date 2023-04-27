package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.CategorieProfHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProfHistoryDao extends AbstractHistoryRepository<CategorieProfHistory,Long> {

}
