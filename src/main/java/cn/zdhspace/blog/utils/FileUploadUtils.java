package cn.zdhspace.blog.utils;


import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.util.UUID;

public class FileUploadUtils {

    static String accessKey = "N8-99u6AwwdMoE8w9giO3pW9S6mlsW5yQGss6mOy";
    static String secretKey = "TxZE6_Eq6Fhs11ya1NZ7TySNZciikTeSDp0f7u6w";
    static String bucket = "space-1";

    public static String uploadFile(CommonsMultipartFile file){
        Configuration configuration = new Configuration(Zone.zone2());
        UploadManager uploadManager = new UploadManager(configuration);
        Auth auth = Auth.create(accessKey,secretKey);
        String upToken = auth.uploadToken(bucket);
        String fileName = file.getOriginalFilename();
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."));
        String fileKey = UUID.randomUUID()+fileSuffix;
        String filePath = null;
        try {
            Response response = uploadManager.put(file.getBytes(),fileKey,upToken);
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            filePath = "http://oxxzvl4bo.bkt.clouddn.com/"+putRet.key;
        } catch (QiniuException e) {
            e.printStackTrace();
        }
        return filePath;
    }

}
