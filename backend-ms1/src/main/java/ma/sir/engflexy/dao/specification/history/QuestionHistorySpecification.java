package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.QuestionHistoryCriteria;
import ma.sir.engflexy.bean.history.QuestionHistory;


public class QuestionHistorySpecification extends AbstractHistorySpecification<QuestionHistoryCriteria, QuestionHistory> {

    public QuestionHistorySpecification(QuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public QuestionHistorySpecification(QuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
