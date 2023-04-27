package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.sir.engflexy.bean.history.FaqTypeHistory;


public class FaqTypeHistorySpecification extends AbstractHistorySpecification<FaqTypeHistoryCriteria, FaqTypeHistory> {

    public FaqTypeHistorySpecification(FaqTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqTypeHistorySpecification(FaqTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
