package  ma.sir.engflexy.dao.specification.history;

import ma.sir.engflexy.zynerator.specification.AbstractHistorySpecification;
import ma.sir.engflexy.dao.criteria.history.ContactHistoryCriteria;
import ma.sir.engflexy.bean.history.ContactHistory;


public class ContactHistorySpecification extends AbstractHistorySpecification<ContactHistoryCriteria, ContactHistory> {

    public ContactHistorySpecification(ContactHistoryCriteria criteria) {
        super(criteria);
    }

    public ContactHistorySpecification(ContactHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
