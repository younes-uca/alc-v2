package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.TypeTeacherHistoryCriteria;
import ma.sir.engflexy.bean.history.TypeTeacherHistory;


public class TypeTeacherHistorySpecification extends AbstractHistorySpecification<TypeTeacherHistoryCriteria, TypeTeacherHistory> {

    public TypeTeacherHistorySpecification(TypeTeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeTeacherHistorySpecification(TypeTeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
