package school.apihei.demo.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import school.apihei.demo.model.Students;

import javax.persistence.EntityManager;
import java.util.List;

public interface StudentRepositoryJPQL{
    //EntityManager entityManager;

    @Query("SELECT s FROM Students s")
    List<Students> findAll();

    @Modifying
    @Query(value = "INSERT INTO Students VALUES ")
    Students add(Students s);
        //this.entityManager.persist(s);

    @Modifying
    @Query("DELETE FROM Students WHERE id = :id")
    void deleteById(@Param("id") Long id);

    @Modifying
    @Query("UPDATE Students SET name = :newName WHERE id = :id")
    Students updateNameById(@Param("id") Long id, @Param("newName") String newName);

    @Query("SELECT s FROM Students s WHERE name LIKE :query")
    List<Students> findWhereNameLike(@Param("query") String query);

}
