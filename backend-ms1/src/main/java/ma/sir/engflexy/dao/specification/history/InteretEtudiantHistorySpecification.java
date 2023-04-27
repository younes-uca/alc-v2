package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.InteretEtudiantHistory;


public class InteretEtudiantHistorySpecification extends AbstractHistorySpecification<InteretEtudiantHistoryCriteria, InteretEtudiantHistory> {

    public InteretEtudiantHistorySpecification(InteretEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public InteretEtudiantHistorySpecification(InteretEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
