package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.EtudiantHistory;


public class EtudiantHistorySpecification extends AbstractHistorySpecification<EtudiantHistoryCriteria, EtudiantHistory> {

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
