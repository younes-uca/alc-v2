package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.NiveauEtude;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.NiveauEtude;
import java.util.List;


@Repository
public interface NiveauEtudeDao extends AbstractRepository<NiveauEtude,Long>  {
    NiveauEtude findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW NiveauEtude(item.id,item.libelle) FROM NiveauEtude item")
    List<NiveauEtude> findAllOptimized();
}
