package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.SkillHistoryCriteria;
import ma.sir.engflexy.bean.history.SkillHistory;


public class SkillHistorySpecification extends AbstractHistorySpecification<SkillHistoryCriteria, SkillHistory> {

    public SkillHistorySpecification(SkillHistoryCriteria criteria) {
        super(criteria);
    }

    public SkillHistorySpecification(SkillHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
