package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.FaqEtudiant;
import ma.sir.engflexy.dao.criteria.core.FaqEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface FaqEtudiantAdminService extends  IService<FaqEtudiant,FaqEtudiantCriteria, FaqEtudiantHistoryCriteria>  {

    List<FaqEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<FaqEtudiant> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqEtudiant> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
