package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.GroupeEtude;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface GroupeEtudeDao extends AbstractRepository<GroupeEtude,Long>  {


    @Query("SELECT NEW GroupeEtude(item.id,item.libelle) FROM GroupeEtude item")
    List<GroupeEtude> findAllOptimized();
}
