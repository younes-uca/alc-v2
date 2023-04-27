package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.InteretEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.InteretEtudiant;
import java.util.List;


@Repository
public interface InteretEtudiantDao extends AbstractRepository<InteretEtudiant,Long>  {
    InteretEtudiant findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW InteretEtudiant(item.id,item.libelle) FROM InteretEtudiant item")
    List<InteretEtudiant> findAllOptimized();
}
