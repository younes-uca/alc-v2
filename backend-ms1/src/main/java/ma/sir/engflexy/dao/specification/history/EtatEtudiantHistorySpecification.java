package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.EtatEtudiantHistory;


public class EtatEtudiantHistorySpecification extends AbstractHistorySpecification<EtatEtudiantHistoryCriteria, EtatEtudiantHistory> {

    public EtatEtudiantHistorySpecification(EtatEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantHistorySpecification(EtatEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
