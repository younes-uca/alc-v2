package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.sir.engflexy.bean.history.LevelTestConfigurationHistory;


public class LevelTestConfigurationHistorySpecification extends AbstractHistorySpecification<LevelTestConfigurationHistoryCriteria, LevelTestConfigurationHistory> {

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
