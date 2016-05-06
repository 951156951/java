package com.github.hualuomoli.raml.join.adaptor.java;

import java.util.List;

import org.raml.model.ActionType;

import com.github.hualuomoli.raml.join.JoinParser.Adapter;
import com.github.hualuomoli.raml.join.adaptor.JavaActionAdaptor;
import com.github.hualuomoli.raml.util.JSONUtils.JsonParam;
import com.google.common.collect.Lists;

/**
 * GET
 * @author hualuomoli
 *
 */
public class JavaGetActionAdaptor extends JavaActionAdaptor {

	@Override
	public boolean support(Adapter adapter) {
		return adapter.action.getType() == ActionType.GET;
	}

	@Override
	protected List<String> getEntityDefinition(Adapter adapter) {

		List<JsonParam> jsonParams = Lists.newArrayList();
		// URI
		jsonParams.addAll(Tool.getUriParams(adapter));
		// QUERY
		jsonParams.addAll(Tool.getQueryParams(adapter));

		String entityName = Tool.getEntityName(adapter);

		return Tool.getClassDefinition(jsonParams, entityName, 0, true);
	}

}
