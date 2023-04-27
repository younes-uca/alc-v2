package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.StatutSocial;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.StatutSocial;
import java.util.List;


@Repository
public interface StatutSocialDao extends AbstractRepository<StatutSocial,Long>  {
    StatutSocial findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW StatutSocial(item.id,item.libelle) FROM StatutSocial item")
    List<StatutSocial> findAllOptimized();
}
