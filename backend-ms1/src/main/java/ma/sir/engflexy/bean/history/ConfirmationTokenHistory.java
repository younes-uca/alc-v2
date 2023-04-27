package ma.sir.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.engflexy.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "confirmation_token")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="confirmation_token_seq",sequenceName="confirmation_token_seq",allocationSize=1, initialValue = 1)
public class ConfirmationTokenHistory extends HistBusinessObject  {


    public ConfirmationTokenHistory() {
    super();
    }

    public ConfirmationTokenHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="confirmation_token_seq")
    public Long getId() {
    return id;
    }
}

