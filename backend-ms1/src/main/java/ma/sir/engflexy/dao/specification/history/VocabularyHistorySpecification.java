package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.VocabularyHistoryCriteria;
import ma.sir.engflexy.bean.history.VocabularyHistory;


public class VocabularyHistorySpecification extends AbstractHistorySpecification<VocabularyHistoryCriteria, VocabularyHistory> {

    public VocabularyHistorySpecification(VocabularyHistoryCriteria criteria) {
        super(criteria);
    }

    public VocabularyHistorySpecification(VocabularyHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
