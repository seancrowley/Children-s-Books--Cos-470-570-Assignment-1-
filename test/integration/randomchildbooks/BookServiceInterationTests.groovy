package randomchildbooks;

import static org.junit.Assert.*;
import groovy.util.GroovyTestCase;

class BookServiceInterationTests extends GroovyTestCase {

	def BookService
	
	void testStaticBook(){
		def staticBook = BookService.getStaticBook()
		assertEquals("Maurice Sendak", staticBook.author)
		assertEquals("Where the Wild Things Are", staticBook.title)
		assertEquals("0060254920", staticBook.ISBN)
		assertEquals("2", staticBook.minimumGradeLevel)
		assertEquals("5", staticBook.maximumGradeLevel)
		assertEquals("English", staticBook.language)
		assertEquals("General Leisure Reading", staticBook.category)
	}
}
