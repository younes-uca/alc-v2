package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.RecommendTeacher;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.RecommendTeacher;
import java.util.List;


@Repository
public interface RecommendTeacherDao extends AbstractRepository<RecommendTeacher,Long>  {
    RecommendTeacher findByRef(String ref);
    int deleteByRef(String ref);

    List<RecommendTeacher> findByProfId(Long id);
    int deleteByProfId(Long id);

    @Query("SELECT NEW RecommendTeacher(item.id,item.ref) FROM RecommendTeacher item")
    List<RecommendTeacher> findAllOptimized();
}
