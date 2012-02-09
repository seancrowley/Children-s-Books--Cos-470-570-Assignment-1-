package randomchildbooks

class BookController {
	def scaffold = true
	def BookService
	def ajaxRandom = {
		def randomBook = bookService.getRandomBook()
		render (view:"bookBody", model: [aBook:randomBook])
	}
	def random = {
		def randomBook = BookService.getRandomBook()
		[aBook : randomBook]
	}
}
