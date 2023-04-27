package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FreeTrialTeacherEmailTemplateHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialTeacherEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialTeacherEmailTemplateHistory,Long> {

}
