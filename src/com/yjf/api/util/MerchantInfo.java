package com.yjf.api.util;

public class MerchantInfo {

	private String merchantId;
	private String merchantKey;
	private String memo;
	
	public MerchantInfo(String merchantId, String merchantKey,
			String memo) {
		this.merchantId = merchantId;
		this.merchantKey = merchantKey;
		this.memo = memo;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public String getMerchantKey() {
		return merchantKey;
	}

	public String getMemo() {
		return memo;
	}
}
