package school.apihei.demo.repository;

import school.apihei.demo.model.Students;

import java.util.List;

public interface StudentRepository {

    List<Students> findAll();

    Students add(Students s);

    void deleteById(Long id);

    Students updateNameById(Long id, String newName);

    List<Students> findWhereNameLike(String query);

}
//implementez cztte interface avec une clasee concrète avec JDBC
// Devoir recherche su google:
// proposez une autre(classe) implémentation avec JPQL (Java Persistence Query Language
// avec @Query);