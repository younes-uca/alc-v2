package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.FaqEtudiantHistory;


public class FaqEtudiantHistorySpecification extends AbstractHistorySpecification<FaqEtudiantHistoryCriteria, FaqEtudiantHistory> {

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
