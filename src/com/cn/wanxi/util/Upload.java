package com.cn.wanxi.util;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Upload {
    public String imgUpload(HttpServletRequest req){
        String savePath = "G:\\jieduansi\\web";//保存图片的路径(具体路径根目录)
        String imgPath = "/loadImg/";//文件前面的路径
        File file = new File(savePath + imgPath );//新建一个目录
        if (!file.exists() && !file.isDirectory()) {
            System.out.println(savePath + "目标目录不存在，需要进行创建");
                file.mkdir();
        }
//        String leave = null;
//        拼接前端传递过来的数据，
        StringBuilder stringBuilder = new StringBuilder();
        try {
            //1 创建DiskFileItemFactory工厂
            DiskFileItemFactory factory = new DiskFileItemFactory();
            //2 创建一个文件上传解析器
            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setHeaderEncoding("UTF-8");
            //判断提交上来的数据是不是表单上的数据
            if (!ServletFileUpload.isMultipartContent(req)) {
                return "";
            }
            //4 使用ServletFileUpload解析器来解析上传数据，解析结果返回的是一个List<FileItem>
            //集合，每一个FileItem对应一个Form表单的输入项
            List<FileItem> list = upload.parseRequest(req);
            for (FileItem item : list) {
//                int id=item.getString()
//                判断内容是否为普通的表单属性
                if (item.isFormField()) {
//                    int id=item.getString()
                    String name = item.getFieldName();
                    String value = item.getString("UTF-8");
                    System.out.println(name + "=" + value);
                    stringBuilder.append(value + "@@");
                } else {
                    String filename = item.getName();//得到文件名称
                    System.out.println(filename);
                    if (filename == null || filename.trim().equals("")) {
                        continue;//跳出当前循环
//                        break;//跳出所有
//                        return;跳出方法
                    }
                    //注意：不同的浏览器提交的文件名是不一样的，有些浏览器提交上来的文件名是带有路径的，如：  c:\a\b\1.txt，而有些只是单纯的文件名，如：1.txt
                    //处理获取到的上传文件的文件名的路径部分，只保留文件名部分
                    filename = filename.substring(filename.lastIndexOf("\\") + 1);

                    //获取item输入流
                    InputStream inputStream = item.getInputStream();
                    //创建一个文件输出流
//                    UUID uuid = UUID.randomUUID();
//                    String picname="QQ截图20200526094946.png";
//                   loadJSP /QQ截图20200526094946+uuid+.png
//                    String[] aa = filename.split("\.");
//                    for (String a : aa)
//                        System.out.println(a);
//                    String newName = (filename.split("."))[0] + uuid + "." + (filename.split("."))[1];
                    String href = imgPath + filename;//数据库保存的路径/loadImg/11.jsp
                    String imgurl = savePath + href;//表示图片存储的路径,保存到硬盘的某个地方
                    if(href.equals("")){
                        href="0";
                    }
                    stringBuilder.append(href + "@@");
                    FileOutputStream fileOutputStream = new FileOutputStream(imgurl);
                    //创建一个缓冲区
                    byte buffer[] = new byte[1024];
                    //判断输入流是否已经读完的标识
                    int len = 0;
                    while ((len = inputStream.read(buffer)) > 0) {
                        fileOutputStream.write(buffer, 0, len);
                    }
                    inputStream.close();
                    fileOutputStream.close();
                    item.delete();
//                    leave = "文件上传成功";
                }
            }
        } catch (Exception e) {
//            leave = "文件上传失败";
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
