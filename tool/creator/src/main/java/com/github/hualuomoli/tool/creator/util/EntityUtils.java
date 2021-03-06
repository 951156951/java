package com.github.hualuomoli.tool.creator.util;

import java.util.List;
import java.util.Set;

import com.github.hualuomoli.tool.creator.entity.Attribute;
import com.github.hualuomoli.tool.creator.entity.Entity;

/**
 * 实体类工具
 * @author hualuomoli
 *
 */
public class EntityUtils extends CreatorUtils {

	/**
	 * 根据实体类的class获取实体类信息
	 * @param entityCls 实体类的class
	 * @param ignores 忽略的属性列
	 * @param projectPackageName 项目包名,如com.github.hualuomoli
	 * @return 实体类信息
	 */
	public static Entity getEntity(Class<?> entityCls, Set<String> ignores, String projectPackageName) {
		Entity entity = new Entity();

		// get attribute
		List<Attribute> attributes = AttributeUtils.getAttributes(entityCls, ignores, projectPackageName);
		//
		String simpleName = entityCls.getSimpleName();
		String fullName = entityCls.getName();
		String dbName = unCamel(simpleName);

		// set
		entity.setCls(entityCls);
		entity.setAttributes(attributes);
		entity.setSimpleName(simpleName);
		entity.setFullName(fullName);
		entity.setDbName(dbName);

		return entity;
	}

}
