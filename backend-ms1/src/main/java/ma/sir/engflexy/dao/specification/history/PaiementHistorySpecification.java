package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.PaiementHistoryCriteria;
import ma.sir.engflexy.bean.history.PaiementHistory;


public class PaiementHistorySpecification extends AbstractHistorySpecification<PaiementHistoryCriteria, PaiementHistory> {

    public PaiementHistorySpecification(PaiementHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementHistorySpecification(PaiementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
