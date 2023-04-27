package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.sir.engflexy.bean.history.FreeTrialTeacherEmailTemplateHistory;


public class FreeTrialTeacherEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateHistory> {

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
