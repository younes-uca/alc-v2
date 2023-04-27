package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Contact;
import ma.sir.engflexy.bean.history.ContactHistory;
import ma.sir.engflexy.dao.criteria.core.ContactCriteria;
import ma.sir.engflexy.dao.criteria.history.ContactHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.ContactDao;
import ma.sir.engflexy.dao.facade.history.ContactHistoryDao;
import ma.sir.engflexy.dao.specification.core.ContactSpecification;
import ma.sir.engflexy.service.facade.admin.ContactAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ContactAdminServiceImpl extends AbstractServiceImpl<Contact,ContactHistory, ContactCriteria, ContactHistoryCriteria, ContactDao,
ContactHistoryDao> implements ContactAdminService {




    public void configure() {
        super.configure(Contact.class,ContactHistory.class, ContactHistoryCriteria.class, ContactSpecification.class);
    }

    public ContactAdminServiceImpl(ContactDao dao, ContactHistoryDao historyDao) {
        super(dao, historyDao);
    }

}