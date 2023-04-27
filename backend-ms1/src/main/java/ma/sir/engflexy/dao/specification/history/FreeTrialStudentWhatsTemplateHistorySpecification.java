package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.sir.engflexy.bean.history.FreeTrialStudentWhatsTemplateHistory;


public class FreeTrialStudentWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateHistory> {

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
