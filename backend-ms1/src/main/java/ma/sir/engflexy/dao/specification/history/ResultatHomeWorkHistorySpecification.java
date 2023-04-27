package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ResultatHomeWorkHistoryCriteria;
import ma.sir.engflexy.bean.history.ResultatHomeWorkHistory;


public class ResultatHomeWorkHistorySpecification extends AbstractHistorySpecification<ResultatHomeWorkHistoryCriteria, ResultatHomeWorkHistory> {

    public ResultatHomeWorkHistorySpecification(ResultatHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public ResultatHomeWorkHistorySpecification(ResultatHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
