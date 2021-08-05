package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends JpaRepository<Books, Integer>  
{  
}  