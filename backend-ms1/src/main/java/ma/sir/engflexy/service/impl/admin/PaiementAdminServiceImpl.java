package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Paiement;
import ma.sir.engflexy.bean.history.PaiementHistory;
import ma.sir.engflexy.dao.criteria.core.PaiementCriteria;
import ma.sir.engflexy.dao.criteria.history.PaiementHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.PaiementDao;
import ma.sir.engflexy.dao.facade.history.PaiementHistoryDao;
import ma.sir.engflexy.dao.specification.core.PaiementSpecification;
import ma.sir.engflexy.service.facade.admin.PaiementAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;
import ma.sir.engflexy.service.facade.admin.GroupeEtudiantAdminService ;


import java.util.List;
@Service
public class PaiementAdminServiceImpl extends AbstractServiceImpl<Paiement,PaiementHistory, PaiementCriteria, PaiementHistoryCriteria, PaiementDao,
PaiementHistoryDao> implements PaiementAdminService {



    public List<Paiement> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<Paiement> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }

    public void configure() {
        super.configure(Paiement.class,PaiementHistory.class, PaiementHistoryCriteria.class, PaiementSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;
    public PaiementAdminServiceImpl(PaiementDao dao, PaiementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}