package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.TypeReclamationEtudiant;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.TypeReclamationEtudiant;
import java.util.List;


@Repository
public interface TypeReclamationEtudiantDao extends AbstractRepository<TypeReclamationEtudiant,Long>  {
    TypeReclamationEtudiant findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeReclamationEtudiant(item.id,item.libelle) FROM TypeReclamationEtudiant item")
    List<TypeReclamationEtudiant> findAllOptimized();
}
