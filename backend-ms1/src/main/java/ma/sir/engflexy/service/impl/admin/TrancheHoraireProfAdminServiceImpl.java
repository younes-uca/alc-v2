package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.TrancheHoraireProf;
import ma.sir.engflexy.bean.history.TrancheHoraireProfHistory;
import ma.sir.engflexy.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.sir.engflexy.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.TrancheHoraireProfDao;
import ma.sir.engflexy.dao.facade.history.TrancheHoraireProfHistoryDao;
import ma.sir.engflexy.dao.specification.core.TrancheHoraireProfSpecification;
import ma.sir.engflexy.service.facade.admin.TrancheHoraireProfAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class TrancheHoraireProfAdminServiceImpl extends AbstractServiceImpl<TrancheHoraireProf,TrancheHoraireProfHistory, TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria, TrancheHoraireProfDao,
TrancheHoraireProfHistoryDao> implements TrancheHoraireProfAdminService {



    public List<TrancheHoraireProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }

    public void configure() {
        super.configure(TrancheHoraireProf.class,TrancheHoraireProfHistory.class, TrancheHoraireProfHistoryCriteria.class, TrancheHoraireProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    public TrancheHoraireProfAdminServiceImpl(TrancheHoraireProfDao dao, TrancheHoraireProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}