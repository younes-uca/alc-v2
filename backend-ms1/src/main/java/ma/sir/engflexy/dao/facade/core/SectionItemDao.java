package ma.sir.engflexy.dao.facade.core;

import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.SectionItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SectionItemDao extends AbstractRepository<SectionItem,Long>  {

    List<SectionItem> findBySectionId(Long id);
    int deleteBySectionId(Long id);

}
