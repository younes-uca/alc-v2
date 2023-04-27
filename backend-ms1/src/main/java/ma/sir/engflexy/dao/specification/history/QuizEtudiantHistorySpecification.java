package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.QuizEtudiantHistory;


public class QuizEtudiantHistorySpecification extends AbstractHistorySpecification<QuizEtudiantHistoryCriteria, QuizEtudiantHistory> {

    public QuizEtudiantHistorySpecification(QuizEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizEtudiantHistorySpecification(QuizEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
