package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.EtatEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.EtatEtudiant;
import java.util.List;


@Repository
public interface EtatEtudiantDao extends AbstractRepository<EtatEtudiant,Long>  {
    EtatEtudiant findByReference(String reference);
    int deleteByReference(String reference);


    @Query("SELECT NEW EtatEtudiant(item.id,item.reference) FROM EtatEtudiant item")
    List<EtatEtudiant> findAllOptimized();
}
