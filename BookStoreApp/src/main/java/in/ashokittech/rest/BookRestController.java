package in.ashokittech.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import in.ashokittech.bind.Book;
import in.ashokittech.dao.BookDao;
import in.ashokittech.service.BookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BookRestController {

	@Autowired
	private BookService bookservice;
	
	
	@PostMapping(value="/bookDetail",
	produces= {
			MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE
	})
	public ResponseEntity<List<Book>> bookDetail(@RequestBody List<Book> books) {
   	 List<Book> booksList=  bookservice.bookDetail(books);  
		return new ResponseEntity<>(booksList,HttpStatus.OK);
	}
	
	//For adding one book
	         @PostMapping(value="/addonebook",
			produces= {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE
			})
			public Book oneBookAdd(@RequestBody Book book) {
				Book oneBookAdd = bookservice.oneBookAdd(book);
				return oneBookAdd;
			}
	
	        @GetMapping("/fetch/{fetch}")
	        public ResponseEntity<Book> fetchBook(@PathVariable("fetch") Integer fetch) {
	        	Book fetchBook=bookservice.fetchBook(fetch);           
				return new ResponseEntity<>(fetchBook,HttpStatus.OK);
	        	
	        }
	        
	        @GetMapping("/fetchAllBooks")
	        public ResponseEntity<List<Book>> getAllBooks() {
	        	 List<Book> booksList=  bookservice.getAllBooks();     
				return new ResponseEntity(booksList,HttpStatus.OK);
	        	
	        }
}
