package generate;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * t_customer
 * @author 
 */
@Data
public class TCustomer implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 所属客户(附属卡，表示本客户是被合并到所属客户下)
     */
    private Long ctmParentId;

    /**
     * 客户编码(：CTM_CODE)
     */
    private String ctmCode;

    /**
     * 客户名称(主联系人名称)
     */
    private String ctmName;

    /**
     * 手机号码(主联系人手机号)
     */
    private String mobile;

    /**
     * 销售类型
     */
    private Integer salesType;

    /**
     * 客户类型
     */
    private Integer ctmType;

    /**
     * 所属车厂ID
     */
    private Long oemCompanyId;

    /**
     * 所属公司ID
     */
    private Long dlrCompanyId;

    /**
     * 经销商ID
     */
    private Long dealerId;

    /**
     * 展厅记录ID
     */
    private Long hallId;

    /**
     * 大客户号
     */
    private String largeCtmId;

    /**
     * 来源类型
     */
    private Integer sourceType;

    /**
     * 业务类型ID
     */
    private Long businessModel;

    /**
     * 一级来源ID
     */
    private Long firstSource;

    /**
     * 二级来源ID
     */
    private Long secondSource;

    /**
     * 市场活动ID
     */
    private Long activityId;

    /**
     * 客户获得信息途径
     */
    private String ctmWay;

    /**
     * 客户获得信息途径-媒体名称
     */
    private String ctmGetMedia;

    /**
     * 客户获得信息途径备注
     */
    private String ctmWayMemo;

    /**
     * 销售顾问ID
     */
    private Long ctmSalesId;

    /**
     * 分配时间
     */
    private Date disTime;

    /**
     * 客户状态
     */
    private Integer ctmStatus;

    /**
     * 客户级别
     */
    private Long ctmLevel;

    /**
     * 建卡时间
     */
    private Date createCardDate;

    /**
     * 客户首次进店时间
     */
    private Date ctmFirstComeDate;

    /**
     * 客户跟进阶段
     */
    private String ctmFollowStatus;

    /**
     * 跟进次数
     */
    private Integer followNumber;

    /**
     * 最后跟进日期
     */
    private Date lastFollowDate;

    /**
     * 下次跟进日期
     */
    private Date nextFollowDate;

    /**
     * 是否手机建卡(用于统计是否移动端加卡)
     */
    private Integer isApp;

    /**
     * 源公司ID
     */
    private Long oldCompanyId;

    /**
     * 合并时间
     */
    private Date mergeTime;

    /**
     * 公司名称
     */
    private String comName;

    /**
     * 公司省份
     */
    private Long comProvince;

    /**
     * 公司市
     */
    private Long comCity;

    /**
     * 公司县
     */
    private Long comCounty;

    /**
     * 公司性质
     */
    private Integer comProperty;

    /**
     * 经营状况
     */
    private String comStateOperation;

    /**
     * 公司代码
     */
    private String comCode;

    /**
     * 公司地址
     */
    private String comAdd;

    /**
     * 公司网址
     */
    private String comUrl;

    /**
     * 行业分类（第一级）
     */
    private Integer comIndustryTypeOne;

    /**
     * 行业分类(第二级)
     */
    private Integer comIndustryTypeTwo;

    /**
     * 行业分类（第三级）
     */
    private Integer comIndustryTypeThree;

    /**
     * 行业分类
     */
    private Integer comIndustryType;

    /**
     * 主营业务
     */
    private String comMainBusiness;

    /**
     * 营业额
     */
    private String comTurnover;

    /**
     * 公司电话
     */
    private String comTel;

    /**
     * 公司Email
     */
    private String comEmail;

    /**
     * 公司规模
     */
    private Integer comScale;

    /**
     * 上级单位
     */
    private String comSuperOrg;

    /**
     * 备注
     */
    private String memo;

    /**
     * 是否发送 1278
     */
    private Integer isSend;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 发送结果code
     */
    private Integer sendResultCode;

    /**
     * 客户来源 9011
     */
    private Integer comWay;

    /**
     * 客户所属 7028
     */
    private Integer ctmProperty;

    /**
     * 删除标识
     */
    private Integer isDeleted;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Long updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 对应活动表——获取信息途径/定义
     */
    private Long activityChannelDefine;

    /**
     * 对应活动表——投放媒体(新)
     */
    private Long activityMedia;

    /**
     * 意向强度得分
     */
    private String smartScore;

    /**
     * leads平台任务编号
     */
    private Long lmpTaskId;

    private static final long serialVersionUID = 1L;
}
