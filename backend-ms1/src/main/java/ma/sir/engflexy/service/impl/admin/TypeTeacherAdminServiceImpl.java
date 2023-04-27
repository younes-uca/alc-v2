package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.TypeTeacher;
import ma.sir.engflexy.bean.history.TypeTeacherHistory;
import ma.sir.engflexy.dao.criteria.core.TypeTeacherCriteria;
import ma.sir.engflexy.dao.criteria.history.TypeTeacherHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.TypeTeacherDao;
import ma.sir.engflexy.dao.facade.history.TypeTeacherHistoryDao;
import ma.sir.engflexy.dao.specification.core.TypeTeacherSpecification;
import ma.sir.engflexy.service.facade.admin.TypeTeacherAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeTeacherAdminServiceImpl extends AbstractServiceImpl<TypeTeacher,TypeTeacherHistory, TypeTeacherCriteria, TypeTeacherHistoryCriteria, TypeTeacherDao,
TypeTeacherHistoryDao> implements TypeTeacherAdminService {


    public TypeTeacher findByReferenceEntity(TypeTeacher t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeTeacher.class,TypeTeacherHistory.class, TypeTeacherHistoryCriteria.class, TypeTeacherSpecification.class);
    }

    public TypeTeacherAdminServiceImpl(TypeTeacherDao dao, TypeTeacherHistoryDao historyDao) {
        super(dao, historyDao);
    }

}