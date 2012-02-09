<html>
<head> 
   <g:javascript library="jquery" plugin="jquery"/>
	<r:require module="jquery"/>
</head>

<body>
	<div id="displayBook">
		<center>
			<p style="font-size:x-large;">Title</p>
			<p>${aBook.title}</p>
			<p style="font-size:x-large;">Author</p>
			<p>${aBook.author}</p>
			<p style="font-size:x-large;">Description</p>
			<p>${aBook.description}</p>
			<p style="font-size:x-large;">ISBN</p>
			<p>${aBook.ISBN}</p>
			<p style="font-size:x-large;">Minimum Grade Level</p>
			<p>${aBook.minimumGradeLevel}</p>
			<p style="font-size:x-large;">Maximum Grade Level</p>
			<p>${aBook.maximumGradeLevel}</p>
			<p style="font-size:x-large;">Language</p>
			<p>${aBook.language}</p>
			<p style="font-size:x-large;">Category</p>
			<p>${aBook.category}</p>
		</center>			
	</div>
    <r:layoutResources/>
 		
</body>

</html>
