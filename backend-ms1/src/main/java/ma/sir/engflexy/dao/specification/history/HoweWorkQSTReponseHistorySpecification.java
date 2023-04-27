package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.sir.engflexy.bean.history.HoweWorkQSTReponseHistory;


public class HoweWorkQSTReponseHistorySpecification extends AbstractHistorySpecification<HoweWorkQSTReponseHistoryCriteria, HoweWorkQSTReponseHistory> {

    public HoweWorkQSTReponseHistorySpecification(HoweWorkQSTReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public HoweWorkQSTReponseHistorySpecification(HoweWorkQSTReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
