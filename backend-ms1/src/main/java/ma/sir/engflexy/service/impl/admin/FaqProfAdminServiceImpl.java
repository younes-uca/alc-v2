package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.FaqProf;
import ma.sir.engflexy.bean.history.FaqProfHistory;
import ma.sir.engflexy.dao.criteria.core.FaqProfCriteria;
import ma.sir.engflexy.dao.criteria.history.FaqProfHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.FaqProfDao;
import ma.sir.engflexy.dao.facade.history.FaqProfHistoryDao;
import ma.sir.engflexy.dao.specification.core.FaqProfSpecification;
import ma.sir.engflexy.service.facade.admin.FaqProfAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;
import ma.sir.engflexy.service.facade.admin.AdminAdminService ;
import ma.sir.engflexy.service.facade.admin.FaqTypeAdminService ;


import java.util.List;
@Service
public class FaqProfAdminServiceImpl extends AbstractServiceImpl<FaqProf,FaqProfHistory, FaqProfCriteria, FaqProfHistoryCriteria, FaqProfDao,
FaqProfHistoryDao> implements FaqProfAdminService {



    public List<FaqProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<FaqProf> findByAdminId(Long id){
        return dao.findByAdminId(id);
    }
    public int deleteByAdminId(Long id){
        return dao.deleteByAdminId(id);
    }
    public List<FaqProf> findByFaqTypeId(Long id){
        return dao.findByFaqTypeId(id);
    }
    public int deleteByFaqTypeId(Long id){
        return dao.deleteByFaqTypeId(id);
    }

    public void configure() {
        super.configure(FaqProf.class,FaqProfHistory.class, FaqProfHistoryCriteria.class, FaqProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private AdminAdminService adminService ;
    @Autowired
    private FaqTypeAdminService faqTypeService ;
    public FaqProfAdminServiceImpl(FaqProfDao dao, FaqProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}