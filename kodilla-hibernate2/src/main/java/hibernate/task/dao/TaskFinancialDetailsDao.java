package hibernate.task.dao;


import hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
}
