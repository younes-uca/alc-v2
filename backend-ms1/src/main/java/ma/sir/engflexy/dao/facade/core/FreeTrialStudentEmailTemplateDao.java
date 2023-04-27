package ma.sir.engflexy.dao.facade.core;

import ma.sir.engflexy.zynerator.repository.AbstractRepository;
import ma.sir.engflexy.bean.core.FreeTrialStudentEmailTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FreeTrialStudentEmailTemplateDao extends AbstractRepository<FreeTrialStudentEmailTemplate,Long>  {


}
