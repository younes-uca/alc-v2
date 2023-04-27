package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FreeTrialStudentEmailTemplate;
import ma.sir.engflexy.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.sir.engflexy.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FreeTrialStudentEmailTemplateDao;
import ma.sir.engflexy.dao.facade.history.FreeTrialStudentEmailTemplateHistoryDao;
import ma.sir.engflexy.dao.specification.core.FreeTrialStudentEmailTemplateSpecification;
import ma.sir.engflexy.service.facade.admin.FreeTrialStudentEmailTemplateAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialStudentEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentEmailTemplate,FreeTrialStudentEmailTemplateHistory, FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateDao,
FreeTrialStudentEmailTemplateHistoryDao> implements FreeTrialStudentEmailTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialStudentEmailTemplate.class,FreeTrialStudentEmailTemplateHistory.class, FreeTrialStudentEmailTemplateHistoryCriteria.class, FreeTrialStudentEmailTemplateSpecification.class);
    }

    public FreeTrialStudentEmailTemplateAdminServiceImpl(FreeTrialStudentEmailTemplateDao dao, FreeTrialStudentEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}