package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FaqHistoryCriteria;
import ma.sir.engflexy.bean.history.FaqHistory;


public class FaqHistorySpecification extends AbstractHistorySpecification<FaqHistoryCriteria, FaqHistory> {

    public FaqHistorySpecification(FaqHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqHistorySpecification(FaqHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
