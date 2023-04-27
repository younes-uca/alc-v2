package ma.sir.engflexy.service.impl.admin;

import ma.sir.engflexy.bean.core.TeacherLocality;
import ma.sir.engflexy.bean.history.TeacherLocalityHistory;
import ma.sir.engflexy.dao.criteria.core.TeacherLocalityCriteria;
import ma.sir.engflexy.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.sir.engflexy.dao.facade.core.TeacherLocalityDao;
import ma.sir.engflexy.dao.facade.history.TeacherLocalityHistoryDao;
import ma.sir.engflexy.dao.specification.core.TeacherLocalitySpecification;
import ma.sir.engflexy.service.facade.admin.TeacherLocalityAdminService;
import ma.sir.engflexy.zynerator.service.AbstractServiceImpl;
import ma.sir.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;





import java.util.List;
@Service
public class TeacherLocalityAdminServiceImpl extends AbstractServiceImpl<TeacherLocality,TeacherLocalityHistory, TeacherLocalityCriteria, TeacherLocalityHistoryCriteria, TeacherLocalityDao,
TeacherLocalityHistoryDao> implements TeacherLocalityAdminService {

    public Long getNextOrdre() {
    Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
    return max != null ? max + 1 : 1;
    }

    @Cacheable(cacheNames = "teacherLocalitys")
    public List<TeacherLocality> findAll() {
        return super.findAll();
    }

    @CachePut(cacheNames = "teacherLocalitys", key = "#t.id")
    public TeacherLocality create(TeacherLocality t) {
        return super.create(t);
    }

    @CachePut(cacheNames = "teacherLocalitys", key = "#t.id")
    public TeacherLocality update(TeacherLocality t) {
        return super.update(t);
    }

    @Cacheable(cacheNames = "teacherLocalitys", key = "#id")
    public TeacherLocality findById(Long id) {
        return super.findById(id);
    }

    @CacheEvict(cacheNames = "teacherLocalitys", key = "#id")
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public TeacherLocality findByReferenceEntity(TeacherLocality t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TeacherLocality.class,TeacherLocalityHistory.class, TeacherLocalityHistoryCriteria.class, TeacherLocalitySpecification.class);
    }

    public TeacherLocalityAdminServiceImpl(TeacherLocalityDao dao, TeacherLocalityHistoryDao historyDao) {
        super(dao, historyDao);
    }

}