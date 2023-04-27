package ma.sir.engflexy.dao.facade.core;

import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.FreeTrialConfiguration;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FreeTrialConfigurationDao extends AbstractRepository<FreeTrialConfiguration,Long>  {


}
