package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.Fonction;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.Fonction;
import java.util.List;


@Repository
public interface FonctionDao extends AbstractRepository<Fonction,Long>  {
    Fonction findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Fonction(item.id,item.libelle) FROM Fonction item")
    List<Fonction> findAllOptimized();
}
