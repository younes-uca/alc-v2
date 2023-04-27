package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.sir.engflexy.bean.history.CategorieSectionHistory;


public class CategorieSectionHistorySpecification extends AbstractHistorySpecification<CategorieSectionHistoryCriteria, CategorieSectionHistory> {

    public CategorieSectionHistorySpecification(CategorieSectionHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieSectionHistorySpecification(CategorieSectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
