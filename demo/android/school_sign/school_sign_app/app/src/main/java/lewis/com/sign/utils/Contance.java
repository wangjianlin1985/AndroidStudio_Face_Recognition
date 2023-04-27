package lewis.com.sign.utils;

/**
 * Created by Administrator on 2019/5/15.
 */
//接口
public class Contance {
    //换成自己电脑ip
    public static  String BaseUrl="http://192.168.1.6:8080/sign";
    public static String Login=BaseUrl+"/login";//登录
    public static String addKecheng=BaseUrl+"/addKecheng";//添加课程
    public static String getAllKechengByTid=BaseUrl+"/getAllKechengByTid";//添加课程
    public static String getAllStudentRecordBYKname=BaseUrl+"/getAllStudentRecordBYKname";//添加课程
    public static String getTercherInfo=BaseUrl+"/getTercherInfo";//用户信息
    public static String upTercher=BaseUrl+"/upTercher";//修改用户
    public static String addRecord=BaseUrl+"/addRecord";//
    public static String getAllStudentRecordBYKid=BaseUrl+"/getAllStudentRecordBYKid";//
    public static String faceCheckBase64=BaseUrl+"/faceCheckBase64";//人脸搜索

    public static String UpLoadPic=BaseUrl+"/upload";//上传头像


    public static String getAllPositionByKey=BaseUrl+"/position/getAllPositionByKey";//所有
    public static String getMyJianli=BaseUrl+"/jianli/getMyJianli";//所有
    public static String addJianli=BaseUrl+"/jianli/addJianli";//所有
    public static String getCompanyInfo=BaseUrl+"/company/getCompanyInfo";//所有
    public static String addToudi=BaseUrl+"/toudi/addToudi";//所有
    public static String getMyToudi=BaseUrl+"/toudi/getMyToudi";//所有
    public static String storeP=BaseUrl+"/position/storeP";//所有
    public static String getMyStore=BaseUrl+"/position/getMyStore";//所有


    public static String addLuntan=BaseUrl+"/luntan/addLuntan";
    public static String getAllLuntanApp=BaseUrl+"/luntan/getAllLuntanApp";
}
