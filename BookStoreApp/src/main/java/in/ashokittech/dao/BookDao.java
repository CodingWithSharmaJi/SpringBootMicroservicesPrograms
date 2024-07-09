package in.ashokittech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokittech.bind.Book;

public interface BookDao extends JpaRepository<Book, Integer>{

}
