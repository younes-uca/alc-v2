package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.sir.engflexy.bean.history.VocabularyQuizHistory;


public class VocabularyQuizHistorySpecification extends AbstractHistorySpecification<VocabularyQuizHistoryCriteria, VocabularyQuizHistory> {

    public VocabularyQuizHistorySpecification(VocabularyQuizHistoryCriteria criteria) {
        super(criteria);
    }

    public VocabularyQuizHistorySpecification(VocabularyQuizHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
