package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FonctionHistoryCriteria;
import ma.sir.engflexy.bean.history.FonctionHistory;


public class FonctionHistorySpecification extends AbstractHistorySpecification<FonctionHistoryCriteria, FonctionHistory> {

    public FonctionHistorySpecification(FonctionHistoryCriteria criteria) {
        super(criteria);
    }

    public FonctionHistorySpecification(FonctionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
