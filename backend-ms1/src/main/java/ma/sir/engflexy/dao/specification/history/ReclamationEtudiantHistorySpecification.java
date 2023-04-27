package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.ReclamationEtudiantHistory;


public class ReclamationEtudiantHistorySpecification extends AbstractHistorySpecification<ReclamationEtudiantHistoryCriteria, ReclamationEtudiantHistory> {

    public ReclamationEtudiantHistorySpecification(ReclamationEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationEtudiantHistorySpecification(ReclamationEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
