package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.LangueHistoryCriteria;
import ma.sir.engflexy.bean.history.LangueHistory;


public class LangueHistorySpecification extends AbstractHistorySpecification<LangueHistoryCriteria, LangueHistory> {

    public LangueHistorySpecification(LangueHistoryCriteria criteria) {
        super(criteria);
    }

    public LangueHistorySpecification(LangueHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
