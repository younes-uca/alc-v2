package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.sir.engflexy.bean.history.StatutSocialHistory;


public class StatutSocialHistorySpecification extends AbstractHistorySpecification<StatutSocialHistoryCriteria, StatutSocialHistory> {

    public StatutSocialHistorySpecification(StatutSocialHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutSocialHistorySpecification(StatutSocialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
