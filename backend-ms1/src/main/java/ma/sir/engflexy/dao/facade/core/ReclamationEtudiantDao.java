package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.ReclamationEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.ReclamationEtudiant;
import java.util.List;


@Repository
public interface ReclamationEtudiantDao extends AbstractRepository<ReclamationEtudiant,Long>  {
    ReclamationEtudiant findByReference(String reference);
    int deleteByReference(String reference);

    List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id);
    int deleteByTypeReclamationEtudiantId(Long id);

    @Query("SELECT NEW ReclamationEtudiant(item.id,item.reference) FROM ReclamationEtudiant item")
    List<ReclamationEtudiant> findAllOptimized();
}
