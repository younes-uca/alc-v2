package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.RecommendTeacher;
import ma.sir.engflexy.bean.history.RecommendTeacherHistory;
import ma.sir.engflexy.dao.criteria.core.RecommendTeacherCriteria;
import ma.sir.engflexy.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.RecommendTeacherDao;
import ma.sir.engflexy.dao.facade.history.RecommendTeacherHistoryDao;
import ma.sir.engflexy.dao.specification.core.RecommendTeacherSpecification;
import ma.sir.engflexy.service.facade.admin.RecommendTeacherAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.engflexy.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class RecommendTeacherAdminServiceImpl extends AbstractServiceImpl<RecommendTeacher,RecommendTeacherHistory, RecommendTeacherCriteria, RecommendTeacherHistoryCriteria, RecommendTeacherDao,
RecommendTeacherHistoryDao> implements RecommendTeacherAdminService {


    public RecommendTeacher findByReferenceEntity(RecommendTeacher t){
        return  dao.findByRef(t.getRef());
    }

    public List<RecommendTeacher> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }

    public void configure() {
        super.configure(RecommendTeacher.class,RecommendTeacherHistory.class, RecommendTeacherHistoryCriteria.class, RecommendTeacherSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    public RecommendTeacherAdminServiceImpl(RecommendTeacherDao dao, RecommendTeacherHistoryDao historyDao) {
        super(dao, historyDao);
    }

}