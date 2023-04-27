package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.sir.engflexy.bean.history.TypeDeQuestionHistory;


public class TypeDeQuestionHistorySpecification extends AbstractHistorySpecification<TypeDeQuestionHistoryCriteria, TypeDeQuestionHistory> {

    public TypeDeQuestionHistorySpecification(TypeDeQuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeDeQuestionHistorySpecification(TypeDeQuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
