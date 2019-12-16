package com.qf.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

/**
 * Controller基类
 * @author xuzhixiang
 * @date 2017年9月30日18:12:56
 *
 */
public class SuperController {
	
	/**
	 * 将map转换成json字符串
	 * @param map
	 * @return
	 */
	public String toJson(Map<String, Object> map) {
		return JSONObject.fromObject(map).toString();
	}
	
	public <T> String toJson(List<T> list) {
		return JSONObject.fromObject(list).toString();
	}
	
	/**
	 * 获取一个map
	 * @return
	 */
	public static Map<String, Object> getMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}
}
