package in.ashokittech.service;

import java.util.List;

import in.ashokittech.bind.Book;

public interface BookServiceImpl {
	List<Book> bookDetail(List<Book> books);
	List<Book> getAllBooks();
}
