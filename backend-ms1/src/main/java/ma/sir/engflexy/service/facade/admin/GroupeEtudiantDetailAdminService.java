package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.GroupeEtudiantDetail;
import ma.sir.engflexy.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.sir.engflexy.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface GroupeEtudiantDetailAdminService extends  IService<GroupeEtudiantDetail,GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria>  {

    List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<GroupeEtudiantDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
