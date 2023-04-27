package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Contact;
import ma.sir.engflexy.dao.criteria.core.ContactCriteria;
import ma.sir.engflexy.dao.criteria.history.ContactHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ContactAdminService extends  IService<Contact,ContactCriteria, ContactHistoryCriteria>  {




}
