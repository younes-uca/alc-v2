package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.CategorieProfHistoryCriteria;
import ma.sir.engflexy.bean.history.CategorieProfHistory;


public class CategorieProfHistorySpecification extends AbstractHistorySpecification<CategorieProfHistoryCriteria, CategorieProfHistory> {

    public CategorieProfHistorySpecification(CategorieProfHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieProfHistorySpecification(CategorieProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
