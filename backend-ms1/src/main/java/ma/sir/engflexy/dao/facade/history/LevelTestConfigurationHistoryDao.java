package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.LevelTestConfigurationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelTestConfigurationHistoryDao extends AbstractHistoryRepository<LevelTestConfigurationHistory,Long> {

}
