package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.ConfirmationToken;
import ma.sir.engflexy.dao.criteria.core.ConfirmationTokenCriteria;
import ma.sir.engflexy.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ConfirmationTokenAdminService extends  IService<ConfirmationToken,ConfirmationTokenCriteria, ConfirmationTokenHistoryCriteria>  {

    List<ConfirmationToken> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
