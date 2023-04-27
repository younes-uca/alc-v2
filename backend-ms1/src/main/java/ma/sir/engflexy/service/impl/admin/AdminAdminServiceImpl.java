package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Admin;
import ma.sir.engflexy.bean.history.AdminHistory;
import ma.sir.engflexy.dao.criteria.core.AdminCriteria;
import ma.sir.engflexy.dao.criteria.history.AdminHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.AdminDao;
import ma.sir.engflexy.dao.facade.history.AdminHistoryDao;
import ma.sir.engflexy.dao.specification.core.AdminSpecification;
import ma.sir.engflexy.service.facade.admin.AdminAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AdminAdminServiceImpl extends AbstractServiceImpl<Admin,AdminHistory, AdminCriteria, AdminHistoryCriteria, AdminDao,
AdminHistoryDao> implements AdminAdminService {




    public void configure() {
        super.configure(Admin.class,AdminHistory.class, AdminHistoryCriteria.class, AdminSpecification.class);
    }

    public AdminAdminServiceImpl(AdminDao dao, AdminHistoryDao historyDao) {
        super(dao, historyDao);
    }

}