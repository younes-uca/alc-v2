package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.sir.engflexy.bean.history.FreeTrialConfigurationHistory;


public class FreeTrialConfigurationHistorySpecification extends AbstractHistorySpecification<FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationHistory> {

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
