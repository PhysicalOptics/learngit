package com.ultrapower.cxf.util;

/**
 * @Classname Constants.java
 * @ClassDescription 通用常量�?
 * @author mazhichao
 * @Date Jul 5, 2012
 * @Version V1.0
 */
public interface Constants {
    
    public static String VALIDATE_CONFIG_FILE_PATH = "com/ultrapower/iam/server/config/param_validate.xml";
    
    /**
     * HISTORY_PWD_COUNT:�?大历史密码存储个�?
     */
    public static final int HISTORY_PWD_COUNT = 12;
    
    /**
     * PAGE_SIZE:列表默认每页显示数据条数
     */
    public static final int PAGE_SIZE = 10;

    /**
     * PAGE_NUM:列表默认显示第几页数�?
     * 
     */
    public static final int PAGE_NUM = 1;

    /**
     * SESSION_PAGE_SIZE_NAME:session中存储pageSize的Attribute名称
     */
    public static final String SESSION_PAGE_SIZE_NAME = "session_pagesize";

    /**
     * SESSION_PAGE_NUM_NAME:session中存储pageNum的Attribute名称
     */
    public static final String SESSION_PAGE_NUM_NAME = "session_pagenum";

    /**
     * SESSION_PID_NAME:session中存储parentId的Attribute名称
     */
    public static final String SESSION_PID_NAME = "parent_id";

    /**
     * SESSION_PAGE_INFO:列表数据存储在Session中Attribute的名�?
     * 
     */
    public static final String SESSION_PAGE_INFO = "session_page_info";

    /**
     * SESSION_QUERY_FORM:查询表单存储在Session中Attribute的名�?
     * 
     */
    public static final String SESSION_QUERY_FORM = "session_query_form";
    
    /**
     * 分页数据存放的map
     */
    public static String SESSION_QUERY_MAP = "session_query_map";
    /**
     * 请求的url
     */
    public static String REQUEST_URL = "request_url";
    /**
     * 跳转到其他页面的标识
     */
    public static String GOTO_OTHER_PAGE = "go_other_page";
    /**
     * 从其他模块跳回的标识
     */
    public static String OTHER_MODE_PAGE = "other_mode_page";
    /**
     * 从其他页面返回后进行的翻�?
     */
    public static String OTHERPAGE_RETURN_PAGING = "otherpage_return_paging";
    /**
     * 存放formKey的session的Key�?
     * 
     */
    public static String FORM_KEY = "formKey";
    /**
     * 存放�?有模块keystore的session的key�?
     */
    public static String ALL_KEYSTORE_SESSION = "all_keystore_session";
    /**
     * 存放当前模块keystore的key值的session的key�?
     */
    public static String MODE_KEYSTORE_session ="mode_keystore_session";
    
    /**
     * ADD_SUCCESS:添加成功
     */
    public static String ADD_SUCCESS = "add.success";

    /**
     * ADD_SYN_SUCCESS:添加并同步成�?
     */
    public static String ADD_SYN_SUCCESS = "add.syn.success";

    /**
     * MODIFY_SUCCESS:修改成功
     */
    public static String MODIFY_SUCCESS = "modify.success";

    /**
     * MODIFY_SYN_SUCCESS:修改并同步成�?
     */
    public static String MODIFY_SYN_SUCCESS = "modify.syn.success";
    
    /**
     * DELETE_SUCCESS:删除成功
     */
    public static String DELETE_SUCCESS = "delete.success";
    
    /**
     * RESROLE_DELETEAUTHZ_SUCCESS:解除授权成功
     */
    public static String  RESROLE_DELETEAUTHZ_SUCCESS = "resrole_deleteAuthz_success";
   
    
    /**
     * DELETE_SUCCESS:删除成功
     */
    public static String APPRES_CLIENT_DELETE_FAILED = "appres.client.delete.failure";
    
    /**
     * DELETE_SYN_SUCCESS:修改并同步成�?
     */
    public static String DELETE_SYN_SUCCESS = "delete.syn.success";
    
    /**
     * ENCRTY_ALGORITHM_AMS:AMS系统使用的加密算法实现类的key�?
     */
    public static final String ENCRTY_ALGORITHM_AMS = "AMS";
    
    /**
     * ENCRTY_KEYGENERATOR_AMS:AMS系统使用的生成加密key实现类的key�?
     */
    public static final String ENCRTY_KEYGENERATOR_AMS = "AMS";
    
    // 堡垒主机类型 内嵌�? 新的堡垒主机 0
    public static final String FORT_TYPE_EMBEDDED = "0";

    // 堡垒主机类型 分离�? 帕拉�? 1
    public static final String FORT_TYPE_SEPARATION = "1";
    //批量操作用到，保存从帐号或�?�资源角色对象的session的key
    public static final String BATCH_OBJ_KEY = "batch.obj.key";
    //批量操作应用从帐号类�?
    public static final String BATCH_APPRESACC_TYPE = "appResAcc";
    //批量操作系统资源从帐号类�?
    public static final String BATCH_SYSRESACC_TYPE = "sysResAcc";
    //批量操作资源角色类型
    public static final String BATCH_RESROLE_TYPE = "resRole";
    //批量操作主帐号业务id
    public static final String BATCH_USER_USERID = "batch.userId";
    //批量操作主帐号uuid
    public static final String BATCH_USER_UUID = "batch.uuid";
    //批量操作主帐号名�?
    public static final String BATCH_USER_NAME = "batch.userName";    
    
    /** 
     * AUTHZ_TEMPLET_ID TODO (生成操作授权模板的模板id) 
     * @author xiaoxuepeng
     * @date 2013-1-8 下午05:13:39
     */ 
    public static final String AUTHZ_TEMPLET_ID = "authz";
    
    /**
     * ROOTID：根节点ID
     */
    public static final String ROOTID = "-1";
    /**
     * 数据库类�?
     */
    public static final String DBTYPE="dbtype";
    /**
     * 数据库类型：oracle
     */
    public static final String DBTYPE_ORACLE="oracle";
    /**
     * 数据库类型：sybase
     */
    public static final String DBTYPE_SYBASE="sybase";
    
    /**
     * postgre类型
     */
    public static final String DBTYPE_POSTGRE="postgre";
    
    /**
     * 配置文件�?关�?�为�?  true
     */
    public static final String TRUE = "true";
    
    /**
     * 配置文件�?关�?�为�? false
     */
    public static final String FALSE = "false";
    
    /**
     * 集团帐号jt_�?�?
     */
    public static final String JTUser = "jt_";
    
    /**
     * DELETE_AUTHZ_SUCCESS:解除授权成功
     */
    public static String DELETE_AUTHZ_SUCCESS = "delete.authz.success";
    
    /**
     * Y：业务系�?
     */
    public static String BUSINESSSYS_YES = "Y";
    /**
     * N：资源组
     */
    public static String BUSINESSSYS_NO = "N";
    /**
     * Y：手工创建从帐号
     */
    public static String AUTOCREATE_YES = "Y";
    /**
     * N：非手工创建从帐�?
     */
    public static String AUTOCREATE_NO = "N";
    /**
     * 从帐号自动开�?
     */
    public static String RESACCAUTOOPEN = "res_acc_auto_open";
    /**
     * 操作授权导入失败
     */
    public static final String IMPORT_AUTHZ_ERROR = "user.operate.authz.importerror";
    
    /**
     * 湖南OA系统同步过来的数据的创建�?
     */
    public static final String OA_SYN_USERNAME = "OASynUserName";
    
    /**
     * 应用资源导入模板下载 模板ID
     */
    public static final String APPRES_TEMPLET_ID = "appResource";
    
    
}
