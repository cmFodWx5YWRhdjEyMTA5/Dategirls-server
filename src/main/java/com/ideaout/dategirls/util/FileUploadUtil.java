package com.ideaout.dategirls.util;

import com.ideaout.dategirls.http.config.Config;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class FileUploadUtil {


    public static  List<String> uploadFile( MultipartFile[] fileArry) {
        List<String> imgList= new ArrayList();
        if (fileArry!=null && fileArry.length>0) {
            for (MultipartFile aFileArry : fileArry) {
                String fileName = aFileArry.getOriginalFilename();//获取文件名加后缀
                if (!TextUtil.isEmpty(fileName)) {
                    String fileF = fileName.substring(fileName.lastIndexOf("."), fileName.length());//文件后缀
                    fileName = new Date().getTime() + "_" + new Random().nextInt(1000) + fileF;//新的文件名

                    String fileAdd = new SimpleDateFormat("yyyyMMdd").format(new Date());
                    String filePath = Config.upload_file_directory + fileAdd; //文件存储位置
                    File file = new File(filePath);
                    //先判断文件是否存在,如果文件夹不存在则创建
                    if (!file.exists() && !file.isDirectory()) {
                        file.mkdir();
                    }
                    File targetFile = new File(file, fileName);
                    try {
                        aFileArry.transferTo(targetFile);
                        String returnUrl = Config.serverUrl + filePath + "/" + fileName; //返回存储路径
                        imgList.add(returnUrl);
                        LogUtil.i("文件保存成功：" + filePath + "/" + fileName + " ,返回URL为：" + returnUrl);
                    } catch (Exception e) {
                        e.printStackTrace();
                        LogUtil.i(e.getMessage());
                    }
                }
            }
        }
        return imgList;
    }
}
