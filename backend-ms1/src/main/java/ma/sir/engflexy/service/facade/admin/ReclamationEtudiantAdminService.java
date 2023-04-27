package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.ReclamationEtudiant;
import ma.sir.engflexy.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ReclamationEtudiantAdminService extends  IService<ReclamationEtudiant,ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria>  {

    List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id);
    int deleteByTypeReclamationEtudiantId(Long id);



}
