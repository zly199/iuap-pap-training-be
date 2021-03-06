package com.yonyou.iuap.model.entity;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.baseservice.entity.AbsDrModel;
import com.yonyou.iuap.baseservice.entity.annotation.Reference;
import com.yonyou.iuap.baseservice.multitenant.entity.MultiTenant;
import com.yonyou.iuap.baseservice.statistics.support.StatFunctions;
import com.yonyou.iuap.baseservice.statistics.support.StatisticsField;
import com.yonyou.iuap.baseservice.support.condition.Condition;
import com.yonyou.iuap.baseservice.support.condition.Match;
import com.yonyou.iuap.baseservice.support.generator.GeneratedValue;
import com.yonyou.iuap.baseservice.support.generator.Strategy;
import com.yonyou.iuap.baseservice.entity.annotation.CodingEntity;
import com.yonyou.iuap.baseservice.entity.annotation.CodingField;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.math.BigDecimal;

/**
 * model测试
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "IUAPD_GRID_TEMP")
@CodingEntity(codingField = "")
public class Model extends AbsDrModel implements Serializable, MultiTenant {
	@Id
	@GeneratedValue
	@Condition
	protected String id;// ID

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(Serializable id) {
		this.id = id.toString();
		super.id = id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Condition
	@Column(name = "MODEL_NAME")
	private String modelName; // 模型名称

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelName() {
		return this.modelName;
	}

	@Condition
	@Column(name = "MODEL_CODE")
	private String modelCode; // 模型编码

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelCode() {
		return this.modelCode;
	}

	@Condition
	@Column(name = "MODEL_TYPE")
	private String modelType; // 模型类型

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getModelType() {
		return this.modelType;
	}

	@Transient
	private String modelTypeEnumValue; // 模型类型

	public void setModelTypeEnumValue(String modelTypeEnumValue) {
		this.modelTypeEnumValue = modelTypeEnumValue;
	}

	public String getModelTypeEnumValue() {
		return this.modelTypeEnumValue;
	}

	@Condition
	@Column(name = "MODEL_CONTENT")
	private String modelContent; // 模板内容

	public void setModelContent(String modelContent) {
		this.modelContent = modelContent;
	}

	public String getModelContent() {
		return this.modelContent;
	}

	@Column(name = "TENANT_ID")
	@Condition
	private String tenantid;

	public String getTenantid() {
		return this.tenantid;
	}

	public void setTenantid(String tenantid) {
		this.tenantid = tenantid;
	}

}
