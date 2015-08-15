package com.yjf.api.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 易极付所有接口枚举
 * @author Administrator
 * 2014-06-17
 */
public enum BornApiServiceEnums {
	
	/**用户管理类接口***/
	USERREGISTER("userRegister", "用户注册[废弃]"),
	YZZUSERREGISTER("yzzUserRegister", "单独用户注册"),
	YZZUSERSPECIALREGISTER("yzzUserSpecialRegister", "用户注册四合一"),
	FORWARDCONIDENTIFY("forwardConIdentify", "跳转用户注册四合一"),
	YZZUSERACCOUNTQUERY("yzzUserAccountQuery", "用户信息查询"),
	
	YZZACTIVATE("yzzActivate", "跳转用户激活"),
	
	APPLYMOBILEBINDINGCUSTOMER("applyMobileBindingCustomer", "申请手机绑定"),
	UPDATEMOBILEBINDINGCUSTOMER("updateMobileBindingCustomer", "更新手机绑定"),
	QUERYMOBILEBINDINGCUSTOMER("queryMobileBindingCustomer", "查询手机绑定"),
	
	YZZPERSONALREALNAMECERT("yzzPersonalRealNameCert", "用户个人实名[废弃]"),
	YZZBUSINESSREALNAMECERT("yzzBusinessRealNameCert", "用户企业实名[废弃]"),
	REALNAMECERT_QUERY("realNameCert.query", "实名信息查询[废弃]"),
	NEW_AUTHORIZE("new_authorize", "跳转实名认证"),
	NEW_AUTHORIZE_QUERY("new_authorize_query", "实名信息查询"),
	REALNAMECERT_SAVE("realNameCert_save", "实名认证保存[废弃]"),
	VERIFYFACADE("verifyFacade", "银行卡校验"),
	BANKCODEBINDING_ADDINFO("bankCodeBinding.addInfo", "添加绑定银行卡"),
	BANKCODEBINDING_SETDEFAULT("bankCodeBinding.setDefault", "设置默认银行卡"),
	BANKCODEBINDINGREMOVE("bankCodeBindingRemove", "移除绑定银行卡"),
	
	SMSCAPTCHA("smsCaptcha", "发送短信服务"),
	SMSCONFIRMVERIFYCODE("smsConfirmVerifyCode", "校验短信服务"),
	
	FORWARDYJFSIT("forwardYJFSit", "跳转易极付官网"),

	
	/**资金类接口***/
	ebankDeposit("ebankDeposit","跳转网银行充值"),
	DEPOSIT("deposit", "跳转网银行充值"),
	DEPOSIT_QUERY("deposit.query", "充值纪录查询"),
	QUERYDEPOSITBYPAYNO("QueryDepositByPayNo", "根据充值流水查询充值纪录"),
	
	DEDUCTSIGN("deductSign", "跳转代扣签约[废弃]"),
	FINDQUICKBANK("findQuickBank", "根据userId查询已签约银行[废弃]"),
	SIGNMANYBANK("signmanybank", "跳转签约"),
	SIGNPACTMANAGER("signPactManager", "跳转查看签约"),
	SIGNMAYBANKQUERY("signmaybankquery", "查询签约明细"),
	
	YZZSYNCDEDUCTDEPOSIT("yzzSyncDeductDeposit", "同步代扣[废弃]"),
	YZZDEDUCTDEPOSIT("yzzDeductDeposit", "异步代扣[废弃]"),
	YZZAPPLYWITHDRAW("yzzApplyWithdraw", "提现[废弃]"),
	YZZNEWDEDUCT("yzzNewDeduct", "用户代扣充值"),
	YZZNEWWITHRAW("yzzNewWithraw", "用户申请提现"),
	YZZNEWDEDUCTPTK("yzzNewDeductPtk", "用户代扣充值"),
	YZZNEWWITHRAWPTK("yzzNewWithrawPtk", "用户申请提现"),
	PPMSTRENGTHENWITHDRAW("ppmStrengthenWithdraw", "PPM提现"),
	YZZSAVEWITHDRAWDATA("yzzSavEWithdrawData", "保存提现纪录"),
	YZZSTRENGTHENWITHDRAW("yzzStrengthenWithdraw", "易周转页面提现"),
	WITHDRAW_QUERY("withdraw.query", "提现记录查询"),


	/** 帐务类 */
	FREEZE_PTK("freeze_ptk", "资金冻结_支付令牌"),
	UN_FREEZE_PTK("un_freeze_ptk", "资金冻结_支付令牌"),
	TRANSFER("transfer", "资金站内转账"),
	TRANSFER_PTK("transfer_ptk", "资金站内转账_支付令牌"),

	/**交易类接口***/
	YZZTRADECREATEPOOLTOGETHER("yzzTradeCreatePoolTogether", "给力式集资交易创建"),
	PAYERAPPLY("payerApply", "跳转给力式集资付款"),
	TRADEPAYPOOLTOGETHER("tradePayPoolTogether", "给力式集体付款"),
	TP_UNFREEZEANDTRANSFER("TP_UnfreezeAndTransfer", "资金池解冻转到平台商"),

	YZZAUTOSIGNCONTRACT("yzzAutoSignContract", "跳转自动投标或还款签约"),
	YZZAUTOBIDTRADE("yzzAutoBidTrade", "自动投标"),
	YZZAUTOWIDEPAYTRADE("yzzAutoWidePayTrade", "自动还款"),
	
	TRADEPAYERQUITPOOLTOGETHER("tradePayerQuitPoolTogether", "给力式申请退出集资"),
	TRADECLOSEPOOLTOGETHER("tradeClosePoolTogether", "给力式集资交易关闭"),
	
	YZZTRADECREATEPOOL("yzzTradeCreatePool", "流标式集资交易创建"),
	RECEIVEBORROW("receiveBorrow", "跳转流标式集资付款"),
	TRADEFINISHPOOL("tradeFinishPool", "流标式集资交易完成"),
	TRADECLOSEPOOL("tradeClosePool", "流标式集资交易关闭"),
	
	YZZTRADECREATEPOOLREVERSE("yzzTradeCreatePoolReverse", "集资还款交易创建"),
	TRADEPOOLPAY("tradePoolPay", "跳转集资还款交易"),
	TRADEFINISHPOOLREVERSE("tradeFinishPoolReverse", "集资还款交易完成"),
	TRADECLOSEPOOLREVERSE("tradeClosePoolReverse", "集资还款交易关闭"),
	
	/**特殊需求类**/
	FASTPAY("fastpay", "及时到账"),
	YZZPAYMENTBOND("yzzPaymentBond", "用户缴纳保证金"),
	TRADEQUERY("tradeQuery", "单个交易查询"),
	YZZ_SEND_BOUNS("yzzSendBonus", "红包派送"),
	YZZ_SEND_EXPERIENCE("yzzSendExperience", "体验金派送"),
	YZZTRADECREATESHARETOGETHER("yzzTradeCreateShareTogether", "创建债权转让标"),
	;
	
	private final String code;
	private final String message;

	/**
	 * 获取所有的枚举
	 * @return
	 */
	public static Map<String, String> getAllEnumMap() {
		Map<String, String> enumMap = new HashMap<String, String>();

		for (BornApiServiceEnums openEnum : BornApiServiceEnums.values()) {
			enumMap.put(openEnum.code, openEnum.message);
		}

		return enumMap;
	}

	/**
	 * 获取所有的枚举
	 * @return
	 */
	public static List<BornApiServiceEnums> getAllEnumList() {
		List<BornApiServiceEnums> enumList = new ArrayList<BornApiServiceEnums>();

		for (BornApiServiceEnums openEnum : BornApiServiceEnums.values()) {
			enumList.add(openEnum);
		}

		return enumList;
	}

	/**
	 * 获取全部枚举值
	 * @return List<String>
	 */
	public List<String> getAllEnumCode() {
		List<String> list = new ArrayList<String>();
		for (BornApiServiceEnums _enum : BornApiServiceEnums.values()) {
			list.add(_enum.code());
		}
		return list;
	}

	/**
	 * 通过枚举<code>code</code>获得枚举
	 * @param code
	 * @return OpenApiServiceEnums
	 */
	public static BornApiServiceEnums getByCode(String code) {
		for (BornApiServiceEnums _enum : BornApiServiceEnums.values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}


	/**
	 * 构造方法
	 * @param code
	 * @param message
	 */
	private BornApiServiceEnums(String code, String message){
		this.code = code;
		this.message = message;
	}

	/**
	 * @return Returns the code.
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return Returns the code.
	 */
	public String code() {
		return code;
	}

	/**
	 * @return Returns the message.
	 */
	public String message() {
		return message;
	}
}
