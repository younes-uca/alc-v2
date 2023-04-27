package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.sir.engflexy.bean.history.FreeTrialformuleHistory;


public class FreeTrialformuleHistorySpecification extends AbstractHistorySpecification<FreeTrialformuleHistoryCriteria, FreeTrialformuleHistory> {

    public FreeTrialformuleHistorySpecification(FreeTrialformuleHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialformuleHistorySpecification(FreeTrialformuleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
