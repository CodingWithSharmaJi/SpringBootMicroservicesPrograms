package in.ashokittech.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokittech.bind.Book;
import in.ashokittech.dao.BookDao;
import java.util.Optional;

@Service
public class BookService implements BookServiceImpl {
	
	@Autowired
	private BookDao bookdao;


	
	public List<Book> bookDetail(List<Book> books) {
		return bookdao.saveAll(books);
		
	}
	
	public List<Book> fetchAllDetails(List<Book> books){
		return books;
		
	}



	public Book oneBookAdd(Book book) {
		return bookdao.save(book);
	}



	



	public Book fetchBook(Integer fetch) {
		Optional<Book> optionalBook = bookdao.findById(fetch);
		Book book=null;
	    // Check if the ticket is present
	    if (optionalBook.isPresent()) {
	    	book= optionalBook.get();
	    } 
	    return book;
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookdao.findAll();
	}




	
//	public List<Book> getBooks(Book book){
//		Iterable<Book> findAll = bookdao.findAll();
//		findAll.forEach(Book->{
//			List<Book> booklist=Arrays.asList(Book);
//		});
//		return booklist;
//		
//	}
}
