package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.sir.engflexy.bean.history.HomeWorkQuestionHistory;


public class HomeWorkQuestionHistorySpecification extends AbstractHistorySpecification<HomeWorkQuestionHistoryCriteria, HomeWorkQuestionHistory> {

    public HomeWorkQuestionHistorySpecification(HomeWorkQuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkQuestionHistorySpecification(HomeWorkQuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
