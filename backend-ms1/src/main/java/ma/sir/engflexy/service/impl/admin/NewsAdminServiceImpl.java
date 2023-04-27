package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.News;
import ma.sir.engflexy.bean.history.NewsHistory;
import ma.sir.engflexy.dao.criteria.core.NewsCriteria;
import ma.sir.engflexy.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.NewsDao;
import ma.sir.engflexy.dao.facade.history.NewsHistoryDao;
import ma.sir.engflexy.dao.specification.core.NewsSpecification;
import ma.sir.engflexy.service.facade.admin.NewsAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NewsAdminServiceImpl extends AbstractServiceImpl<News,NewsHistory, NewsCriteria, NewsHistoryCriteria, NewsDao,
NewsHistoryDao> implements NewsAdminService {


    public News findByReferenceEntity(News t){
        return  dao.findByRef(t.getRef());
    }


    public void configure() {
        super.configure(News.class,NewsHistory.class, NewsHistoryCriteria.class, NewsSpecification.class);
    }

    public NewsAdminServiceImpl(NewsDao dao, NewsHistoryDao historyDao) {
        super(dao, historyDao);
    }

}