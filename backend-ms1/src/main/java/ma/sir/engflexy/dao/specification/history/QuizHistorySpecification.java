package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.QuizHistoryCriteria;
import ma.sir.engflexy.bean.history.QuizHistory;


public class QuizHistorySpecification extends AbstractHistorySpecification<QuizHistoryCriteria, QuizHistory> {

    public QuizHistorySpecification(QuizHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizHistorySpecification(QuizHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
