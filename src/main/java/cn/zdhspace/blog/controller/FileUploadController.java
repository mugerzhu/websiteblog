package cn.zdhspace.blog.controller;


import cn.zdhspace.blog.dto.ImageUploadJsonObject;
import cn.zdhspace.blog.utils.FileUploadUtils;
import com.google.gson.Gson;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Iterator;

@Controller
@RequestMapping(value = "/upload")
/**
 * @author muger
 */
public class FileUploadController {

    @ResponseBody
    @PostMapping(value = "/image")
    public String imageUpload(@RequestParam(value = "editormd-image-file",required = true) CommonsMultipartFile file, HttpServletRequest request){
        Gson gson = new Gson();
        String resultjson = gson.toJson(new ImageUploadJsonObject(1,FileUploadUtils.uploadFile(file)));
        return resultjson;
    }


}
