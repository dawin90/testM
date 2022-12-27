package com.example.t3test.core.common.util;

import java.io.File;

public class UtilUpload {

//	public static void upload (MultipartFile multipartFile, String className, Member dto) throws Exception {
//		String fileName = multipartFile.getOriginalFilename();
//		String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
//		String uuid = UUID.randomUUID().toString();
//		String uuidFileName = uuid + "." + ext;
//		String pathModule = className;
//		String nowString = UtilDateTime.nowString();
//		String pathDate = nowString.substring(0,4) + "/" + nowString.substring(5,7) + "/" + nowString.substring(8,10);
//		String path = Constants.UPLOAD_PATH_PREFIX + "/" + pathModule + "/" + pathDate + "/";
//		String pathForView = Constants.UPLOAD_PATH_PREFIX_FOR_VIEW + "/" + pathModule + "/" + pathDate + "/";
//
//		createPath(path);
//
//		multipartFile.transferTo(new File(path + uuidFileName));
//
//		dto.setPath(pathForView);
//		dto.setOriginalName(fileName);
//		dto.setUuidName(uuidFileName);
//		dto.setExt(ext);
//		dto.setSize(multipartFile.getSize());
//
//	}
	
	
	public static void createPath (String path) {
		File uploadPath = new File(path);
		
		if (!uploadPath.exists()) {
			uploadPath.mkdir();
		} else {
			// by pass
		}
	}
}
