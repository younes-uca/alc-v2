package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.GroupeEtude;
import ma.sir.engflexy.bean.history.GroupeEtudeHistory;
import ma.sir.engflexy.dao.criteria.core.GroupeEtudeCriteria;
import ma.sir.engflexy.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.GroupeEtudeDao;
import ma.sir.engflexy.dao.facade.history.GroupeEtudeHistoryDao;
import ma.sir.engflexy.dao.specification.core.GroupeEtudeSpecification;
import ma.sir.engflexy.service.facade.admin.GroupeEtudeAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class GroupeEtudeAdminServiceImpl extends AbstractServiceImpl<GroupeEtude,GroupeEtudeHistory, GroupeEtudeCriteria, GroupeEtudeHistoryCriteria, GroupeEtudeDao,
GroupeEtudeHistoryDao> implements GroupeEtudeAdminService {




    public void configure() {
        super.configure(GroupeEtude.class,GroupeEtudeHistory.class, GroupeEtudeHistoryCriteria.class, GroupeEtudeSpecification.class);
    }

    public GroupeEtudeAdminServiceImpl(GroupeEtudeDao dao, GroupeEtudeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}