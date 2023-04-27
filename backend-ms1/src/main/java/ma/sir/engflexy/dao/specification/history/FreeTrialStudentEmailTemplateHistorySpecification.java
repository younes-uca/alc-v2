package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.sir.engflexy.bean.history.FreeTrialStudentEmailTemplateHistory;


public class FreeTrialStudentEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateHistory> {

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
