package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.sir.engflexy.bean.history.EtatEtudiantScheduleHistory;


public class EtatEtudiantScheduleHistorySpecification extends AbstractHistorySpecification<EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleHistory> {

    public EtatEtudiantScheduleHistorySpecification(EtatEtudiantScheduleHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantScheduleHistorySpecification(EtatEtudiantScheduleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
