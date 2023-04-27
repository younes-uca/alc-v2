package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.sir.engflexy.bean.history.ClassAverageBonusHistory;


public class ClassAverageBonusHistorySpecification extends AbstractHistorySpecification<ClassAverageBonusHistoryCriteria, ClassAverageBonusHistory> {

    public ClassAverageBonusHistorySpecification(ClassAverageBonusHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusHistorySpecification(ClassAverageBonusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
