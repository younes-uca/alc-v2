package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.PackStudent;
import ma.sir.engflexy.bean.history.PackStudentHistory;
import ma.sir.engflexy.dao.criteria.core.PackStudentCriteria;
import ma.sir.engflexy.dao.criteria.history.PackStudentHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.PackStudentDao;
import ma.sir.engflexy.dao.facade.history.PackStudentHistoryDao;
import ma.sir.engflexy.dao.specification.core.PackStudentSpecification;
import ma.sir.engflexy.service.facade.admin.PackStudentAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.PriceAdminService ;
import ma.sir.engflexy.service.facade.admin.ParcoursAdminService ;


import java.util.List;
@Service
public class PackStudentAdminServiceImpl extends AbstractServiceImpl<PackStudent,PackStudentHistory, PackStudentCriteria, PackStudentHistoryCriteria, PackStudentDao,
PackStudentHistoryDao> implements PackStudentAdminService {


    public PackStudent findByReferenceEntity(PackStudent t){
        return  dao.findByCode(t.getCode());
    }

    public List<PackStudent> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<PackStudent> findByPriceId(Long id){
        return dao.findByPriceId(id);
    }
    public int deleteByPriceId(Long id){
        return dao.deleteByPriceId(id);
    }

    public void configure() {
        super.configure(PackStudent.class,PackStudentHistory.class, PackStudentHistoryCriteria.class, PackStudentSpecification.class);
    }

    @Autowired
    private PriceAdminService priceService ;
    @Autowired
    private ParcoursAdminService parcoursService ;
    public PackStudentAdminServiceImpl(PackStudentDao dao, PackStudentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}