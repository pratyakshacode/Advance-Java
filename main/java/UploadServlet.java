import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("fileupload")
@MultipartConfig(
				maxFileSize = 1024 * 2 * 1024,
				maxRequestSize = 1024 * 1024 * 100)
public class UploadServlet extends HttpServlet{
	
		private static final String UPLOAD_DIR = "uploads";
		
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String applicationPath = req.getServletContext().getRealPath("");
		String uploadPath = applicationPath  + File.separator + UPLOAD_DIR;
		
		File fileSaveDir = new File(uploadPath);
		
		if(!fileSaveDir.exists()) {
			fileSaveDir.mkdir();
		}
		
		System.out.print("Upload file directory = " + fileSaveDir.getAbsolutePath());
		
		for(Part part : req.getParts()) {
			String fileName = "file";
			part.write(uploadPath + File.separator + fileName);
		}
		
		req.setAttribute("msg", "uploaded");
		getServletContext().getRequestDispatcher("/abcd.html").forward(req, res);
		
		
	}
}
