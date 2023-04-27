package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.sir.engflexy.bean.history.FreeTrialHistory;


public class FreeTrialHistorySpecification extends AbstractHistorySpecification<FreeTrialHistoryCriteria, FreeTrialHistory> {

    public FreeTrialHistorySpecification(FreeTrialHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialHistorySpecification(FreeTrialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
