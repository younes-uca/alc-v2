package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.LevelTestConfiguration;
import ma.sir.engflexy.bean.history.LevelTestConfigurationHistory;
import ma.sir.engflexy.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.sir.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.LevelTestConfigurationDao;
import ma.sir.engflexy.dao.facade.history.LevelTestConfigurationHistoryDao;
import ma.sir.engflexy.dao.specification.core.LevelTestConfigurationSpecification;
import ma.sir.engflexy.service.facade.admin.LevelTestConfigurationAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ParcoursAdminService ;


import java.util.List;
@Service
public class LevelTestConfigurationAdminServiceImpl extends AbstractServiceImpl<LevelTestConfiguration,LevelTestConfigurationHistory, LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria, LevelTestConfigurationDao,
LevelTestConfigurationHistoryDao> implements LevelTestConfigurationAdminService {



    public List<LevelTestConfiguration> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }

    public void configure() {
        super.configure(LevelTestConfiguration.class,LevelTestConfigurationHistory.class, LevelTestConfigurationHistoryCriteria.class, LevelTestConfigurationSpecification.class);
    }

    @Autowired
    private ParcoursAdminService parcoursService ;
    public LevelTestConfigurationAdminServiceImpl(LevelTestConfigurationDao dao, LevelTestConfigurationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}