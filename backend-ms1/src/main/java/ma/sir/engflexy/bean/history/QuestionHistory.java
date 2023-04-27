package ma.sir.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.engflexy.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "question")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="question_seq",sequenceName="question_seq",allocationSize=1, initialValue = 1)
public class QuestionHistory extends HistBusinessObject  {


    public QuestionHistory() {
    super();
    }

    public QuestionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="question_seq")
    public Long getId() {
    return id;
    }
}

