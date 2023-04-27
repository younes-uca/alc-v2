package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.WorkloadBonusProf;
import ma.sir.engflexy.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.sir.engflexy.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface WorkloadBonusProfAdminService extends  IService<WorkloadBonusProf,WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria>  {

    List<WorkloadBonusProf> findByWorkloadBonusId(Long id);
    int deleteByWorkloadBonusId(Long id);
    List<WorkloadBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<WorkloadBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
