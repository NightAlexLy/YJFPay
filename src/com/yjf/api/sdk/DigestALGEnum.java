package com.yjf.api.sdk;

/**
 * 签名方式枚举
 */
public enum DigestALGEnum {
	
	SHA256("SHA-256"), MD5("MD5");
	private String	name;
	
	DigestALGEnum(String name) {
		this.name = name;
	}
	
	public static DigestALGEnum getByName(String name) {
		for (DigestALGEnum _enum : values()) {
			if (_enum.getName().equals(name)) {
				return _enum;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}
	
}
