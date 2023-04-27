package ma.sir.engflexy.service.facade.admin;

import java.util.List;
import ma.sir.engflexy.bean.core.RecommendTeacher;
import ma.sir.engflexy.dao.criteria.core.RecommendTeacherCriteria;
import ma.sir.engflexy.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.sir.engflexy.zynerator.service.IService;

public interface RecommendTeacherAdminService extends  IService<RecommendTeacher,RecommendTeacherCriteria, RecommendTeacherHistoryCriteria>  {

    List<RecommendTeacher> findByProfId(Long id);
    int deleteByProfId(Long id);



}
