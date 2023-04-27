package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.SuperCategorieSectionHistoryCriteria;
import ma.sir.engflexy.bean.history.SuperCategorieSectionHistory;


public class SuperCategorieSectionHistorySpecification extends AbstractHistorySpecification<SuperCategorieSectionHistoryCriteria, SuperCategorieSectionHistory> {

    public SuperCategorieSectionHistorySpecification(SuperCategorieSectionHistoryCriteria criteria) {
        super(criteria);
    }

    public SuperCategorieSectionHistorySpecification(SuperCategorieSectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
