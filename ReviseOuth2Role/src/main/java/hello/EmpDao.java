package hello;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpDao extends JpaRepository<Emp,Integer> {


	Emp findByName(String name);
}
