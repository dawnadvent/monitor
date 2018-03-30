package net.monitor.dao.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IOMonitorDTOExample {

  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  protected Integer limitStart;

  protected Integer limitEnd;

  public IOMonitorDTOExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  public String getOrderByClause() {
    return orderByClause;
  }

  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  public boolean isDistinct() {
    return distinct;
  }

  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  public Integer getLimitStart() {
    return limitStart;
  }

  public void setLimitStart(Integer limitStart) {
    this.limitStart = limitStart;
  }

  public Integer getLimitEnd() {
    return limitEnd;
  }

  public void setLimitEnd(Integer limitEnd) {
    this.limitEnd = limitEnd;
  }

  protected abstract static class GeneratedCriteria {

    protected List<Criterion> criteria;

    protected GeneratedCriteria() {
      super();
      criteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
      return criteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
      return criteria;
    }

    public List<Criterion> getCriteria() {
      return criteria;
    }

    protected void addCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      criteria.add(new Criterion(condition));
    }

    protected void addCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value));
    }

    protected void addCriterion(String condition, Object value1, Object value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      criteria.add(new Criterion(condition, value1, value2));
    }

    public Criteria andIdIsNull() {
      addCriterion("id is null");
      return (Criteria) this;
    }

    public Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (Criteria) this;
    }

    public Criteria andIdEqualTo(Long value) {
      addCriterion("id =", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotEqualTo(Long value) {
      addCriterion("id <>", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThan(Long value) {
      addCriterion("id >", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThanOrEqualTo(Long value) {
      addCriterion("id >=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThan(Long value) {
      addCriterion("id <", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThanOrEqualTo(Long value) {
      addCriterion("id <=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdIn(List<Long> values) {
      addCriterion("id in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotIn(List<Long> values) {
      addCriterion("id not in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdBetween(Long value1, Long value2) {
      addCriterion("id between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotBetween(Long value1, Long value2) {
      addCriterion("id not between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andIpIsNull() {
      addCriterion("ip is null");
      return (Criteria) this;
    }

    public Criteria andIpIsNotNull() {
      addCriterion("ip is not null");
      return (Criteria) this;
    }

    public Criteria andIpEqualTo(String value) {
      addCriterion("ip =", value, "ip");
      return (Criteria) this;
    }

    public Criteria andIpNotEqualTo(String value) {
      addCriterion("ip <>", value, "ip");
      return (Criteria) this;
    }

    public Criteria andIpGreaterThan(String value) {
      addCriterion("ip >", value, "ip");
      return (Criteria) this;
    }

    public Criteria andIpGreaterThanOrEqualTo(String value) {
      addCriterion("ip >=", value, "ip");
      return (Criteria) this;
    }

    public Criteria andIpLessThan(String value) {
      addCriterion("ip <", value, "ip");
      return (Criteria) this;
    }

    public Criteria andIpLessThanOrEqualTo(String value) {
      addCriterion("ip <=", value, "ip");
      return (Criteria) this;
    }

    public Criteria andIpLike(String value) {
      addCriterion("ip like", value, "ip");
      return (Criteria) this;
    }

    public Criteria andIpNotLike(String value) {
      addCriterion("ip not like", value, "ip");
      return (Criteria) this;
    }

    public Criteria andIpIn(List<String> values) {
      addCriterion("ip in", values, "ip");
      return (Criteria) this;
    }

    public Criteria andIpNotIn(List<String> values) {
      addCriterion("ip not in", values, "ip");
      return (Criteria) this;
    }

    public Criteria andIpBetween(String value1, String value2) {
      addCriterion("ip between", value1, value2, "ip");
      return (Criteria) this;
    }

    public Criteria andIpNotBetween(String value1, String value2) {
      addCriterion("ip not between", value1, value2, "ip");
      return (Criteria) this;
    }

    public Criteria andDiskNameIsNull() {
      addCriterion("disk_name is null");
      return (Criteria) this;
    }

    public Criteria andDiskNameIsNotNull() {
      addCriterion("disk_name is not null");
      return (Criteria) this;
    }

    public Criteria andDiskNameEqualTo(String value) {
      addCriterion("disk_name =", value, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameNotEqualTo(String value) {
      addCriterion("disk_name <>", value, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameGreaterThan(String value) {
      addCriterion("disk_name >", value, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameGreaterThanOrEqualTo(String value) {
      addCriterion("disk_name >=", value, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameLessThan(String value) {
      addCriterion("disk_name <", value, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameLessThanOrEqualTo(String value) {
      addCriterion("disk_name <=", value, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameLike(String value) {
      addCriterion("disk_name like", value, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameNotLike(String value) {
      addCriterion("disk_name not like", value, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameIn(List<String> values) {
      addCriterion("disk_name in", values, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameNotIn(List<String> values) {
      addCriterion("disk_name not in", values, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameBetween(String value1, String value2) {
      addCriterion("disk_name between", value1, value2, "diskName");
      return (Criteria) this;
    }

    public Criteria andDiskNameNotBetween(String value1, String value2) {
      addCriterion("disk_name not between", value1, value2, "diskName");
      return (Criteria) this;
    }

    public Criteria andAwaitIsNull() {
      addCriterion("await is null");
      return (Criteria) this;
    }

    public Criteria andAwaitIsNotNull() {
      addCriterion("await is not null");
      return (Criteria) this;
    }

    public Criteria andAwaitEqualTo(Float value) {
      addCriterion("await =", value, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitNotEqualTo(Float value) {
      addCriterion("await <>", value, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitGreaterThan(Float value) {
      addCriterion("await >", value, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitGreaterThanOrEqualTo(Float value) {
      addCriterion("await >=", value, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitLessThan(Float value) {
      addCriterion("await <", value, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitLessThanOrEqualTo(Float value) {
      addCriterion("await <=", value, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitIn(List<Float> values) {
      addCriterion("await in", values, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitNotIn(List<Float> values) {
      addCriterion("await not in", values, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitBetween(Float value1, Float value2) {
      addCriterion("await between", value1, value2, "await");
      return (Criteria) this;
    }

    public Criteria andAwaitNotBetween(Float value1, Float value2) {
      addCriterion("await not between", value1, value2, "await");
      return (Criteria) this;
    }

    public Criteria andSvctmIsNull() {
      addCriterion("svctm is null");
      return (Criteria) this;
    }

    public Criteria andSvctmIsNotNull() {
      addCriterion("svctm is not null");
      return (Criteria) this;
    }

    public Criteria andSvctmEqualTo(Float value) {
      addCriterion("svctm =", value, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmNotEqualTo(Float value) {
      addCriterion("svctm <>", value, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmGreaterThan(Float value) {
      addCriterion("svctm >", value, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmGreaterThanOrEqualTo(Float value) {
      addCriterion("svctm >=", value, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmLessThan(Float value) {
      addCriterion("svctm <", value, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmLessThanOrEqualTo(Float value) {
      addCriterion("svctm <=", value, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmIn(List<Float> values) {
      addCriterion("svctm in", values, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmNotIn(List<Float> values) {
      addCriterion("svctm not in", values, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmBetween(Float value1, Float value2) {
      addCriterion("svctm between", value1, value2, "svctm");
      return (Criteria) this;
    }

    public Criteria andSvctmNotBetween(Float value1, Float value2) {
      addCriterion("svctm not between", value1, value2, "svctm");
      return (Criteria) this;
    }

    public Criteria andUtilIsNull() {
      addCriterion("util is null");
      return (Criteria) this;
    }

    public Criteria andUtilIsNotNull() {
      addCriterion("util is not null");
      return (Criteria) this;
    }

    public Criteria andUtilEqualTo(Float value) {
      addCriterion("util =", value, "util");
      return (Criteria) this;
    }

    public Criteria andUtilNotEqualTo(Float value) {
      addCriterion("util <>", value, "util");
      return (Criteria) this;
    }

    public Criteria andUtilGreaterThan(Float value) {
      addCriterion("util >", value, "util");
      return (Criteria) this;
    }

    public Criteria andUtilGreaterThanOrEqualTo(Float value) {
      addCriterion("util >=", value, "util");
      return (Criteria) this;
    }

    public Criteria andUtilLessThan(Float value) {
      addCriterion("util <", value, "util");
      return (Criteria) this;
    }

    public Criteria andUtilLessThanOrEqualTo(Float value) {
      addCriterion("util <=", value, "util");
      return (Criteria) this;
    }

    public Criteria andUtilIn(List<Float> values) {
      addCriterion("util in", values, "util");
      return (Criteria) this;
    }

    public Criteria andUtilNotIn(List<Float> values) {
      addCriterion("util not in", values, "util");
      return (Criteria) this;
    }

    public Criteria andUtilBetween(Float value1, Float value2) {
      addCriterion("util between", value1, value2, "util");
      return (Criteria) this;
    }

    public Criteria andUtilNotBetween(Float value1, Float value2) {
      addCriterion("util not between", value1, value2, "util");
      return (Criteria) this;
    }

    public Criteria andGmtCreateIsNull() {
      addCriterion("gmt_create is null");
      return (Criteria) this;
    }

    public Criteria andGmtCreateIsNotNull() {
      addCriterion("gmt_create is not null");
      return (Criteria) this;
    }

    public Criteria andGmtCreateEqualTo(Date value) {
      addCriterion("gmt_create =", value, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateNotEqualTo(Date value) {
      addCriterion("gmt_create <>", value, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateGreaterThan(Date value) {
      addCriterion("gmt_create >", value, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
      addCriterion("gmt_create >=", value, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateLessThan(Date value) {
      addCriterion("gmt_create <", value, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
      addCriterion("gmt_create <=", value, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateIn(List<Date> values) {
      addCriterion("gmt_create in", values, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateNotIn(List<Date> values) {
      addCriterion("gmt_create not in", values, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateBetween(Date value1, Date value2) {
      addCriterion("gmt_create between", value1, value2, "gmtCreate");
      return (Criteria) this;
    }

    public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
      addCriterion("gmt_create not between", value1, value2, "gmtCreate");
      return (Criteria) this;
    }
  }

  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  public static class Criterion {

    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    protected Criterion(String condition) {
      super();
      this.condition = condition;
      this.typeHandler = null;
      this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.typeHandler = typeHandler;
      if (value instanceof List<?>) {
        this.listValue = true;
      } else {
        this.singleValue = true;
      }
    }

    protected Criterion(String condition, Object value) {
      this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.secondValue = secondValue;
      this.typeHandler = typeHandler;
      this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
      this(condition, value, secondValue, null);
    }

    public String getCondition() {
      return condition;
    }

    public Object getValue() {
      return value;
    }

    public Object getSecondValue() {
      return secondValue;
    }

    public boolean isNoValue() {
      return noValue;
    }

    public boolean isSingleValue() {
      return singleValue;
    }

    public boolean isBetweenValue() {
      return betweenValue;
    }

    public boolean isListValue() {
      return listValue;
    }

    public String getTypeHandler() {
      return typeHandler;
    }
  }
}