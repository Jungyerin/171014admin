package com.grad.admin.vo;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class CodeForm {

	private List<CodeVo> codes;
	private List<CodeVo> codes2;

	public List<CodeVo> getCodes() {
		return codes;
	}

	public void setCodes(List<CodeVo> codes) {
		this.codes = codes;
	}

	public List<CodeVo> getCodes2() {
		return codes2;
	}

	public void setCodes2(List<CodeVo> codes2) {
		this.codes2 = codes2;
	}

	@Override
	public String toString() {
		return "CodeForm [codes=" + codes + ", codes2=" + codes2 + "]";
	}
	
	
	

}
