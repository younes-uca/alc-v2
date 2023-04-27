package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FaqProfHistoryCriteria;
import ma.sir.engflexy.bean.history.FaqProfHistory;


public class FaqProfHistorySpecification extends AbstractHistorySpecification<FaqProfHistoryCriteria, FaqProfHistory> {

    public FaqProfHistorySpecification(FaqProfHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqProfHistorySpecification(FaqProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
