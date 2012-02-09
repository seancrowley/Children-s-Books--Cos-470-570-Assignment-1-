package randomchildbooks

class BookService {
	boolean transactional = false
	def getStaticBook() {
		return new Book(author: "Maurice Sendak",
		title: "Where the Wild Things Are", ISBN: "0060254920", minimumGradeLevel: "2", maximumGradeLevel: "5",
			language: "English", category: "General Leisure Reading" )
	}
	def getRandomBook() {
		def allBooks = randomchildbooks.Book.list()
		def randomBook = null
		if (allBooks.size() > 0) {
			def randomIdx = new Random().nextInt(allBooks.size())
			randomBook = allBooks[randomIdx]
		} else {
			randomBook = getStaticBook()
		}
		return randomBook
	}
}
