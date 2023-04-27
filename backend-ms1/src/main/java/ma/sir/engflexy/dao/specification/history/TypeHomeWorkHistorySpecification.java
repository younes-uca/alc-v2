package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.sir.engflexy.bean.history.TypeHomeWorkHistory;


public class TypeHomeWorkHistorySpecification extends AbstractHistorySpecification<TypeHomeWorkHistoryCriteria, TypeHomeWorkHistory> {

    public TypeHomeWorkHistorySpecification(TypeHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeHomeWorkHistorySpecification(TypeHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
