package ma.sir.engflexy.dao.facade.history;

import ma.sir.engflexy.zynerator.repository.AbstractHistoryRepository;
import ma.sir.engflexy.bean.history.FreeTrialStudentEmailTemplateHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialStudentEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialStudentEmailTemplateHistory,Long> {

}
