package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Price;
import ma.sir.engflexy.bean.history.PriceHistory;
import ma.sir.engflexy.dao.criteria.core.PriceCriteria;
import ma.sir.engflexy.dao.criteria.history.PriceHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.PriceDao;
import ma.sir.engflexy.dao.facade.history.PriceHistoryDao;
import ma.sir.engflexy.dao.specification.core.PriceSpecification;
import ma.sir.engflexy.service.facade.admin.PriceAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class PriceAdminServiceImpl extends AbstractServiceImpl<Price,PriceHistory, PriceCriteria, PriceHistoryCriteria, PriceDao,
PriceHistoryDao> implements PriceAdminService {




    public void configure() {
        super.configure(Price.class,PriceHistory.class, PriceHistoryCriteria.class, PriceSpecification.class);
    }

    public PriceAdminServiceImpl(PriceDao dao, PriceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}