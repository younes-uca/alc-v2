package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.HomeWorkEtudiant;
import ma.sir.engflexy.dao.criteria.core.HomeWorkEtudiantCriteria;
import ma.sir.engflexy.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface HomeWorkEtudiantAdminService extends  IService<HomeWorkEtudiant,HomeWorkEtudiantCriteria, HomeWorkEtudiantHistoryCriteria>  {

    List<HomeWorkEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<HomeWorkEtudiant> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);
    List<HomeWorkEtudiant> findByResultatHomeWorkId(Long id);
    int deleteByResultatHomeWorkId(Long id);



}
