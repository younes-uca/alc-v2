package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.LevelTestConfiguration;
import ma.sir.engflexy.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.sir.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface LevelTestConfigurationAdminService extends  IService<LevelTestConfiguration,LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria>  {

    List<LevelTestConfiguration> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
