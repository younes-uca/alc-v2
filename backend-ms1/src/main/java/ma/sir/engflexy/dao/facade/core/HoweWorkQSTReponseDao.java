package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.HoweWorkQSTReponse;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.HoweWorkQSTReponse;
import java.util.List;


@Repository
public interface HoweWorkQSTReponseDao extends AbstractRepository<HoweWorkQSTReponse,Long>  {
    HoweWorkQSTReponse findByRef(String ref);
    int deleteByRef(String ref);

    List<HoweWorkQSTReponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);

    @Query("SELECT NEW HoweWorkQSTReponse(item.id,item.lib) FROM HoweWorkQSTReponse item")
    List<HoweWorkQSTReponse> findAllOptimized();
}
