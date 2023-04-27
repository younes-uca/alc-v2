package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.engflexy.bean.history.NewsHistory;


public class NewsHistorySpecification extends AbstractHistorySpecification<NewsHistoryCriteria, NewsHistory> {

    public NewsHistorySpecification(NewsHistoryCriteria criteria) {
        super(criteria);
    }

    public NewsHistorySpecification(NewsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
