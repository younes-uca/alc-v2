package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.TypeTeacher;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.TypeTeacher;
import java.util.List;


@Repository
public interface TypeTeacherDao extends AbstractRepository<TypeTeacher,Long>  {
    TypeTeacher findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeTeacher(item.id,item.libelle) FROM TypeTeacher item")
    List<TypeTeacher> findAllOptimized();
}
