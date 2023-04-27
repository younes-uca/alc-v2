package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FreeTrialStudentWhatsTemplate;
import ma.sir.engflexy.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.sir.engflexy.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FreeTrialStudentWhatsTemplateDao;
import ma.sir.engflexy.dao.facade.history.FreeTrialStudentWhatsTemplateHistoryDao;
import ma.sir.engflexy.dao.specification.core.FreeTrialStudentWhatsTemplateSpecification;
import ma.sir.engflexy.service.facade.admin.FreeTrialStudentWhatsTemplateAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FreeTrialStudentWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentWhatsTemplate,FreeTrialStudentWhatsTemplateHistory, FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateDao,
FreeTrialStudentWhatsTemplateHistoryDao> implements FreeTrialStudentWhatsTemplateAdminService {




    public void configure() {
        super.configure(FreeTrialStudentWhatsTemplate.class,FreeTrialStudentWhatsTemplateHistory.class, FreeTrialStudentWhatsTemplateHistoryCriteria.class, FreeTrialStudentWhatsTemplateSpecification.class);
    }

    public FreeTrialStudentWhatsTemplateAdminServiceImpl(FreeTrialStudentWhatsTemplateDao dao, FreeTrialStudentWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}