package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.HomeWork;
import ma.sir.engflexy.dao.criteria.core.HomeWorkCriteria;
import ma.sir.engflexy.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface HomeWorkAdminService extends  IService<HomeWork,HomeWorkCriteria, HomeWorkHistoryCriteria>  {

    List<HomeWork> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<HomeWork> findByTypeHomeWorkId(Long id);
    int deleteByTypeHomeWorkId(Long id);



}
