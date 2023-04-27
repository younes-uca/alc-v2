package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.DictionaryHistoryCriteria;
import ma.sir.engflexy.bean.history.DictionaryHistory;


public class DictionaryHistorySpecification extends AbstractHistorySpecification<DictionaryHistoryCriteria, DictionaryHistory> {

    public DictionaryHistorySpecification(DictionaryHistoryCriteria criteria) {
        super(criteria);
    }

    public DictionaryHistorySpecification(DictionaryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
