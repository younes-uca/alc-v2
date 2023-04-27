package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.sir.engflexy.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.sir.engflexy.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FreeTrialTeacherWhatsTemplateDao;
import ma.sir.engflexy.dao.facade.history.FreeTrialTeacherWhatsTemplateHistoryDao;
import ma.sir.engflexy.dao.specification.core.FreeTrialTeacherWhatsTemplateSpecification;
import ma.sir.engflexy.service.facade.admin.FreeTrialTeacherWhatsTemplateAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialTeacherWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherWhatsTemplate,FreeTrialTeacherWhatsTemplateHistory, FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateDao,
FreeTrialTeacherWhatsTemplateHistoryDao> implements FreeTrialTeacherWhatsTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialTeacherWhatsTemplate.class,FreeTrialTeacherWhatsTemplateHistory.class, FreeTrialTeacherWhatsTemplateHistoryCriteria.class, FreeTrialTeacherWhatsTemplateSpecification.class);
    }

    public FreeTrialTeacherWhatsTemplateAdminServiceImpl(FreeTrialTeacherWhatsTemplateDao dao, FreeTrialTeacherWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}