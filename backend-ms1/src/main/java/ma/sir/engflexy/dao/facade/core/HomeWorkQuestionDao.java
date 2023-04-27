package ma.sir.engflexy.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.HomeWorkQuestion;
import org.springframework.stereotype.Repository;
import ma.sir.engflexy.bean.core.HomeWorkQuestion;
import java.util.List;


@Repository
public interface HomeWorkQuestionDao extends AbstractRepository<HomeWorkQuestion,Long>  {
    HomeWorkQuestion findByRef(String ref);
    int deleteByRef(String ref);

    List<HomeWorkQuestion> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<HomeWorkQuestion> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);

    @Query("SELECT NEW HomeWorkQuestion(item.id,item.libelle) FROM HomeWorkQuestion item")
    List<HomeWorkQuestion> findAllOptimized();
}
