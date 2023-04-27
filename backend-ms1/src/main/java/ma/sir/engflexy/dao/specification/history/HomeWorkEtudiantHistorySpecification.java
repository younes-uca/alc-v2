package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.sir.engflexy.bean.history.HomeWorkEtudiantHistory;


public class HomeWorkEtudiantHistorySpecification extends AbstractHistorySpecification<HomeWorkEtudiantHistoryCriteria, HomeWorkEtudiantHistory> {

    public HomeWorkEtudiantHistorySpecification(HomeWorkEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkEtudiantHistorySpecification(HomeWorkEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
