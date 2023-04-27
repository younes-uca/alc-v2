package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.FreeTrialDetail;
import ma.sir.engflexy.dao.criteria.core.FreeTrialDetailCriteria;
import ma.sir.engflexy.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface FreeTrialDetailAdminService extends  IService<FreeTrialDetail,FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria>  {

    List<FreeTrialDetail> findByFreeTrialId(Long id);
    int deleteByFreeTrialId(Long id);
    List<FreeTrialDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
