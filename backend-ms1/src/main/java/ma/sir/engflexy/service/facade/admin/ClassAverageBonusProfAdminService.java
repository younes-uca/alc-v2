package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.ClassAverageBonusProf;
import ma.sir.engflexy.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.sir.engflexy.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface ClassAverageBonusProfAdminService extends  IService<ClassAverageBonusProf,ClassAverageBonusProfCriteria, ClassAverageBonusProfHistoryCriteria>  {

    List<ClassAverageBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ClassAverageBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
