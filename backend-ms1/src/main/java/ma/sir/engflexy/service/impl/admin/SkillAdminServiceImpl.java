package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.Skill;
import ma.sir.engflexy.bean.history.SkillHistory;
import ma.sir.engflexy.dao.criteria.core.SkillCriteria;
import ma.sir.engflexy.dao.criteria.history.SkillHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.SkillDao;
import ma.sir.engflexy.dao.facade.history.SkillHistoryDao;
import ma.sir.engflexy.dao.specification.core.SkillSpecification;
import ma.sir.engflexy.service.facade.admin.SkillAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SkillAdminServiceImpl extends AbstractServiceImpl<Skill,SkillHistory, SkillCriteria, SkillHistoryCriteria, SkillDao,
SkillHistoryDao> implements SkillAdminService {


    public Skill findByReferenceEntity(Skill t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Skill.class,SkillHistory.class, SkillHistoryCriteria.class, SkillSpecification.class);
    }

    public SkillAdminServiceImpl(SkillDao dao, SkillHistoryDao historyDao) {
        super(dao, historyDao);
    }

}