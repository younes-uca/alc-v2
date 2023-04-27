package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.sir.engflexy.bean.history.FreeTrialDetailHistory;


public class FreeTrialDetailHistorySpecification extends AbstractHistorySpecification<FreeTrialDetailHistoryCriteria, FreeTrialDetailHistory> {

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
