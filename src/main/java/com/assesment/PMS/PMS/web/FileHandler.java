package com.assesment.PMS.PMS.web;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Timestamp;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileHandler {

	public static String savePhotograph(String name, MultipartFile file, String imagePath) throws IOException{
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		String fileExt = fileName.substring(fileName.lastIndexOf("."));
		Timestamp timestamp = new Timestamp (System.currentTimeMillis());
		fileName = name.replace(" ", "")+"_"+timestamp.getTime()+fileExt;
		String uplodDir = imagePath;
		Path uploadPath = Paths.get(uplodDir);
		if(!Files.exists(uploadPath)) {
		Files.createDirectories(uploadPath);
		}
		try(InputStream inp = file.getInputStream()) {
		Path filePath = uploadPath.resolve(fileName);
		Files.copy(inp, filePath ,StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException ex) {
		throw new IOException("File upload fail : " +fileName, ex);
		}
		return fileName;
	}
	
	
	





}
