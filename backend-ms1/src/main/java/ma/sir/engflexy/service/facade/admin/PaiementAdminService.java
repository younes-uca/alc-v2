package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.Paiement;
import ma.sir.engflexy.dao.criteria.core.PaiementCriteria;
import ma.sir.engflexy.dao.criteria.history.PaiementHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface PaiementAdminService extends  IService<Paiement,PaiementCriteria, PaiementHistoryCriteria>  {

    List<Paiement> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<Paiement> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);



}
