package project.service;

import org.springframework.web.multipart.MultipartFile;



public interface FileWriter {

	enum Folder{
		 TYPE,CATEGORY,COMMODITY
	}
	
	boolean write(Folder folder, MultipartFile file, Integer id);
}
