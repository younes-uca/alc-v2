package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FaqType;
import ma.sir.engflexy.bean.history.FaqTypeHistory;
import ma.sir.engflexy.dao.criteria.core.FaqTypeCriteria;
import ma.sir.engflexy.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FaqTypeDao;
import ma.sir.engflexy.dao.facade.history.FaqTypeHistoryDao;
import ma.sir.engflexy.dao.specification.core.FaqTypeSpecification;
import ma.sir.engflexy.service.facade.admin.FaqTypeAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class FaqTypeAdminServiceImpl extends AbstractServiceImpl<FaqType,FaqTypeHistory, FaqTypeCriteria, FaqTypeHistoryCriteria, FaqTypeDao,
FaqTypeHistoryDao> implements FaqTypeAdminService {




    public void configure() {
        super.configure(FaqType.class,FaqTypeHistory.class, FaqTypeHistoryCriteria.class, FaqTypeSpecification.class);
    }

    public FaqTypeAdminServiceImpl(FaqTypeDao dao, FaqTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}