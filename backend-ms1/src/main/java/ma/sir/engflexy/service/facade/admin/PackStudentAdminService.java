package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.PackStudent;
import ma.sir.engflexy.dao.criteria.core.PackStudentCriteria;
import ma.sir.engflexy.dao.criteria.history.PackStudentHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface PackStudentAdminService extends  IService<PackStudent,PackStudentCriteria, PackStudentHistoryCriteria>  {

    List<PackStudent> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<PackStudent> findByPriceId(Long id);
    int deleteByPriceId(Long id);



}
