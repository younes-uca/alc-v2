package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FreeTrialTeacherEmailTemplate;
import ma.sir.engflexy.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.sir.engflexy.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FreeTrialTeacherEmailTemplateDao;
import ma.sir.engflexy.dao.facade.history.FreeTrialTeacherEmailTemplateHistoryDao;
import ma.sir.engflexy.dao.specification.core.FreeTrialTeacherEmailTemplateSpecification;
import ma.sir.engflexy.service.facade.admin.FreeTrialTeacherEmailTemplateAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialTeacherEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherEmailTemplate,FreeTrialTeacherEmailTemplateHistory, FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateDao,
FreeTrialTeacherEmailTemplateHistoryDao> implements FreeTrialTeacherEmailTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialTeacherEmailTemplate.class,FreeTrialTeacherEmailTemplateHistory.class, FreeTrialTeacherEmailTemplateHistoryCriteria.class, FreeTrialTeacherEmailTemplateSpecification.class);
    }

    public FreeTrialTeacherEmailTemplateAdminServiceImpl(FreeTrialTeacherEmailTemplateDao dao, FreeTrialTeacherEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}