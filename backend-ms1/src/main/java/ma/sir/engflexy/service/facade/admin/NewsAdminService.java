package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.News;
import ma.sir.engflexy.dao.criteria.core.NewsCriteria;
import ma.sir.engflexy.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface NewsAdminService extends  IService<News,NewsCriteria, NewsHistoryCriteria>  {




}
