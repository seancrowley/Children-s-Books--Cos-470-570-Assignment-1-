package randomchildbooks

import java.util.regex.*

class Book {
	String title
	String author
	String description
	String ISBN
	String minimumGradeLevel
	String maximumGradeLevel
	String language
	String category
	static constraints = {
		title(maxSize:500, blank:false)
		author(maxSize:100, blank:false)
		description(maxSize:1000, blank:true)
		ISBN(blank:true, matches:'^(97(8|9))?\\d{9}(\\d|X)$')
		minimumGradeLevel(blank:false, inList: ["0", "1", "2", "3", "4", "5", "6"])
		maximumGradeLevel(blank:false, inList: ["0", "1", "2", "3", "4", "5", "6"])
		language(blank:false)
		category(blank:false, inList: ["General Leisure Reading", "Reading Skills",
			"Math Skills", "Health", "Science"])
	}
}