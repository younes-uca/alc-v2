package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.sir.engflexy.bean.history.ClassAverageBonusProfHistory;


public class ClassAverageBonusProfHistorySpecification extends AbstractHistorySpecification<ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfHistory> {

    public ClassAverageBonusProfHistorySpecification(ClassAverageBonusProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusProfHistorySpecification(ClassAverageBonusProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
