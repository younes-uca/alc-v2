package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.EtatCours;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.EtatCours;
import java.util.List;


@Repository
public interface EtatCoursDao extends AbstractRepository<EtatCours,Long>  {
    EtatCours findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatCours(item.id,item.libelle) FROM EtatCours item")
    List<EtatCours> findAllOptimized();
}
