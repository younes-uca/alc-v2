package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.FreeTrialformule;
import ma.sir.engflexy.dao.criteria.core.FreeTrialformuleCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface FreeTrialformuleAdminService extends  IService<FreeTrialformule,FreeTrialformuleCriteria, FreeTrialformuleHistoryCriteria>  {

    List<FreeTrialformule> findByInscriptionId(Long id);
    int deleteByInscriptionId(Long id);



}
