package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Services;
import ma.sir.engflexy.dao.criteria.core.ServicesCriteria;
import ma.sir.engflexy.dao.criteria.history.ServicesHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ServicesAdminService extends  IService<Services,ServicesCriteria, ServicesHistoryCriteria>  {

    Long getNextOrdre();



}
