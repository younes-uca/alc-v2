package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.CalendrierProf;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.CalendrierProf;
import java.util.List;


@Repository
public interface CalendrierProfDao extends AbstractRepository<CalendrierProf,Long>  {
    CalendrierProf findByRef(String ref);
    int deleteByRef(String ref);

    List<CalendrierProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<CalendrierProf> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

    @Query("SELECT NEW CalendrierProf(item.id,item.ref) FROM CalendrierProf item")
    List<CalendrierProf> findAllOptimized();
}
