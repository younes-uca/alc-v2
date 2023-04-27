package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.sir.engflexy.bean.history.EtudiantCoursHistory;


public class EtudiantCoursHistorySpecification extends AbstractHistorySpecification<EtudiantCoursHistoryCriteria, EtudiantCoursHistory> {

    public EtudiantCoursHistorySpecification(EtudiantCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantCoursHistorySpecification(EtudiantCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
