package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.GroupeEtudiantDetail;
import ma.sir.engflexy.bean.history.GroupeEtudiantDetailHistory;
import ma.sir.engflexy.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.sir.engflexy.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.GroupeEtudiantDetailDao;
import ma.sir.engflexy.dao.facade.history.GroupeEtudiantDetailHistoryDao;
import ma.sir.engflexy.dao.specification.core.GroupeEtudiantDetailSpecification;
import ma.sir.engflexy.service.facade.admin.GroupeEtudiantDetailAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.EtudiantAdminService ;
import ma.sir.engflexy.service.facade.admin.GroupeEtudiantAdminService ;


import java.util.List;
@Service
public class GroupeEtudiantDetailAdminServiceImpl extends AbstractServiceImpl<GroupeEtudiantDetail,GroupeEtudiantDetailHistory, GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailDao,
GroupeEtudiantDetailHistoryDao> implements GroupeEtudiantDetailAdminService {



    public List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }
    public List<GroupeEtudiantDetail> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(GroupeEtudiantDetail.class,GroupeEtudiantDetailHistory.class, GroupeEtudiantDetailHistoryCriteria.class, GroupeEtudiantDetailSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;
    public GroupeEtudiantDetailAdminServiceImpl(GroupeEtudiantDetailDao dao, GroupeEtudiantDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

}