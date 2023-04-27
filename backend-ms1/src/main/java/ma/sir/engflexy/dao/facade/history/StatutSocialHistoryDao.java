package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.StatutSocialHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutSocialHistoryDao extends AbstractHistoryRepository<StatutSocialHistory,Long> {

}
