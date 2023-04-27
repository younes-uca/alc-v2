package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.PriceHistoryCriteria;
import ma.sir.engflexy.bean.history.PriceHistory;


public class PriceHistorySpecification extends AbstractHistorySpecification<PriceHistoryCriteria, PriceHistory> {

    public PriceHistorySpecification(PriceHistoryCriteria criteria) {
        super(criteria);
    }

    public PriceHistorySpecification(PriceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
