<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <form action="upload.jsp" method="post" enctype="multipart/form-data">
            <fieldset style="width:20%; background-color: #e6ff99">
                <h2>File Upload Example</h2>
                <hr>
                Select a file to upload: <br /><br />
                <input type="file" name="file" size="50" />
                <br /><br />
                <input type="submit" value="Upload File" />
            </fieldset>
        </form>
</body>
</html>