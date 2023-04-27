package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.SkillHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillHistoryDao extends AbstractHistoryRepository<SkillHistory,Long> {

}
