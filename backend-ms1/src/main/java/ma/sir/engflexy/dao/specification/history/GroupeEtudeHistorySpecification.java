package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.sir.engflexy.bean.history.GroupeEtudeHistory;


public class GroupeEtudeHistorySpecification extends AbstractHistorySpecification<GroupeEtudeHistoryCriteria, GroupeEtudeHistory> {

    public GroupeEtudeHistorySpecification(GroupeEtudeHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudeHistorySpecification(GroupeEtudeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
