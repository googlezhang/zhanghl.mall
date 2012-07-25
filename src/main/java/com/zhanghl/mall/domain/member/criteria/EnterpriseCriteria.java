package com.zhanghl.mall.domain.member.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterpriseCriteria {

    protected String         orderByClause;

    protected List<Criteria> oredCriteria;

    public EnterpriseCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected EnterpriseCriteria(EnterpriseCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
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
    }

    public static class Criteria {

        protected List<String>              criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0
                   || criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<?> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return this;
        }

        public Criteria andContactPersonNameIsNull() {
            addCriterion("contact_person_name is null");
            return this;
        }

        public Criteria andContactPersonNameIsNotNull() {
            addCriterion("contact_person_name is not null");
            return this;
        }

        public Criteria andContactPersonNameEqualTo(String value) {
            addCriterion("contact_person_name =", value, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameNotEqualTo(String value) {
            addCriterion("contact_person_name <>", value, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameGreaterThan(String value) {
            addCriterion("contact_person_name >", value, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person_name >=", value, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameLessThan(String value) {
            addCriterion("contact_person_name <", value, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameLessThanOrEqualTo(String value) {
            addCriterion("contact_person_name <=", value, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameLike(String value) {
            addCriterion("contact_person_name like", value, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameNotLike(String value) {
            addCriterion("contact_person_name not like", value, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameIn(List<String> values) {
            addCriterion("contact_person_name in", values, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameNotIn(List<String> values) {
            addCriterion("contact_person_name not in", values, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameBetween(String value1, String value2) {
            addCriterion("contact_person_name between", value1, value2, "contactPersonName");
            return this;
        }

        public Criteria andContactPersonNameNotBetween(String value1, String value2) {
            addCriterion("contact_person_name not between", value1, value2, "contactPersonName");
            return this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return this;
        }

        public Criteria andDepartmentEqualTo(Short value) {
            addCriterion("department =", value, "department");
            return this;
        }

        public Criteria andDepartmentNotEqualTo(Short value) {
            addCriterion("department <>", value, "department");
            return this;
        }

        public Criteria andDepartmentGreaterThan(Short value) {
            addCriterion("department >", value, "department");
            return this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Short value) {
            addCriterion("department >=", value, "department");
            return this;
        }

        public Criteria andDepartmentLessThan(Short value) {
            addCriterion("department <", value, "department");
            return this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Short value) {
            addCriterion("department <=", value, "department");
            return this;
        }

        public Criteria andDepartmentIn(List<Short> values) {
            addCriterion("department in", values, "department");
            return this;
        }

        public Criteria andDepartmentNotIn(List<Short> values) {
            addCriterion("department not in", values, "department");
            return this;
        }

        public Criteria andDepartmentBetween(Short value1, Short value2) {
            addCriterion("department between", value1, value2, "department");
            return this;
        }

        public Criteria andDepartmentNotBetween(Short value1, Short value2) {
            addCriterion("department not between", value1, value2, "department");
            return this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return this;
        }

        public Criteria andPhoneNumberEqualTo(String value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberLessThan(String value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberLike(String value) {
            addCriterion("phone_number like", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberNotLike(String value) {
            addCriterion("phone_number not like", value, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberIn(List<String> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return this;
        }

        public Criteria andPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberIsNull() {
            addCriterion("cellphone_number is null");
            return this;
        }

        public Criteria andCellphoneNumberIsNotNull() {
            addCriterion("cellphone_number is not null");
            return this;
        }

        public Criteria andCellphoneNumberEqualTo(String value) {
            addCriterion("cellphone_number =", value, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberNotEqualTo(String value) {
            addCriterion("cellphone_number <>", value, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberGreaterThan(String value) {
            addCriterion("cellphone_number >", value, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cellphone_number >=", value, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberLessThan(String value) {
            addCriterion("cellphone_number <", value, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberLessThanOrEqualTo(String value) {
            addCriterion("cellphone_number <=", value, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberLike(String value) {
            addCriterion("cellphone_number like", value, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberNotLike(String value) {
            addCriterion("cellphone_number not like", value, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberIn(List<String> values) {
            addCriterion("cellphone_number in", values, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberNotIn(List<String> values) {
            addCriterion("cellphone_number not in", values, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberBetween(String value1, String value2) {
            addCriterion("cellphone_number between", value1, value2, "cellphoneNumber");
            return this;
        }

        public Criteria andCellphoneNumberNotBetween(String value1, String value2) {
            addCriterion("cellphone_number not between", value1, value2, "cellphoneNumber");
            return this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return this;
        }

        public Criteria andCompanyProvinceIsNull() {
            addCriterion("company_province is null");
            return this;
        }

        public Criteria andCompanyProvinceIsNotNull() {
            addCriterion("company_province is not null");
            return this;
        }

        public Criteria andCompanyProvinceEqualTo(Short value) {
            addCriterion("company_province =", value, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceNotEqualTo(Short value) {
            addCriterion("company_province <>", value, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceGreaterThan(Short value) {
            addCriterion("company_province >", value, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceGreaterThanOrEqualTo(Short value) {
            addCriterion("company_province >=", value, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceLessThan(Short value) {
            addCriterion("company_province <", value, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceLessThanOrEqualTo(Short value) {
            addCriterion("company_province <=", value, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceIn(List<Short> values) {
            addCriterion("company_province in", values, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceNotIn(List<Short> values) {
            addCriterion("company_province not in", values, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceBetween(Short value1, Short value2) {
            addCriterion("company_province between", value1, value2, "companyProvince");
            return this;
        }

        public Criteria andCompanyProvinceNotBetween(Short value1, Short value2) {
            addCriterion("company_province not between", value1, value2, "companyProvince");
            return this;
        }

        public Criteria andCompanyCityIsNull() {
            addCriterion("company_city is null");
            return this;
        }

        public Criteria andCompanyCityIsNotNull() {
            addCriterion("company_city is not null");
            return this;
        }

        public Criteria andCompanyCityEqualTo(Short value) {
            addCriterion("company_city =", value, "companyCity");
            return this;
        }

        public Criteria andCompanyCityNotEqualTo(Short value) {
            addCriterion("company_city <>", value, "companyCity");
            return this;
        }

        public Criteria andCompanyCityGreaterThan(Short value) {
            addCriterion("company_city >", value, "companyCity");
            return this;
        }

        public Criteria andCompanyCityGreaterThanOrEqualTo(Short value) {
            addCriterion("company_city >=", value, "companyCity");
            return this;
        }

        public Criteria andCompanyCityLessThan(Short value) {
            addCriterion("company_city <", value, "companyCity");
            return this;
        }

        public Criteria andCompanyCityLessThanOrEqualTo(Short value) {
            addCriterion("company_city <=", value, "companyCity");
            return this;
        }

        public Criteria andCompanyCityIn(List<Short> values) {
            addCriterion("company_city in", values, "companyCity");
            return this;
        }

        public Criteria andCompanyCityNotIn(List<Short> values) {
            addCriterion("company_city not in", values, "companyCity");
            return this;
        }

        public Criteria andCompanyCityBetween(Short value1, Short value2) {
            addCriterion("company_city between", value1, value2, "companyCity");
            return this;
        }

        public Criteria andCompanyCityNotBetween(Short value1, Short value2) {
            addCriterion("company_city not between", value1, value2, "companyCity");
            return this;
        }

        public Criteria andCompanyDistrictIsNull() {
            addCriterion("company_district is null");
            return this;
        }

        public Criteria andCompanyDistrictIsNotNull() {
            addCriterion("company_district is not null");
            return this;
        }

        public Criteria andCompanyDistrictEqualTo(Short value) {
            addCriterion("company_district =", value, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictNotEqualTo(Short value) {
            addCriterion("company_district <>", value, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictGreaterThan(Short value) {
            addCriterion("company_district >", value, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictGreaterThanOrEqualTo(Short value) {
            addCriterion("company_district >=", value, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictLessThan(Short value) {
            addCriterion("company_district <", value, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictLessThanOrEqualTo(Short value) {
            addCriterion("company_district <=", value, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictIn(List<Short> values) {
            addCriterion("company_district in", values, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictNotIn(List<Short> values) {
            addCriterion("company_district not in", values, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictBetween(Short value1, Short value2) {
            addCriterion("company_district between", value1, value2, "companyDistrict");
            return this;
        }

        public Criteria andCompanyDistrictNotBetween(Short value1, Short value2) {
            addCriterion("company_district not between", value1, value2, "companyDistrict");
            return this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("purchase_type is null");
            return this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("purchase_type is not null");
            return this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("purchase_type =", value, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("purchase_type <>", value, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("purchase_type >", value, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_type >=", value, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("purchase_type <", value, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("purchase_type <=", value, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("purchase_type like", value, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("purchase_type not like", value, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("purchase_type in", values, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("purchase_type not in", values, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("purchase_type between", value1, value2, "purchaseType");
            return this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("purchase_type not between", value1, value2, "purchaseType");
            return this;
        }

        public Criteria andCompanyWebsiteIsNull() {
            addCriterion("company_website is null");
            return this;
        }

        public Criteria andCompanyWebsiteIsNotNull() {
            addCriterion("company_website is not null");
            return this;
        }

        public Criteria andCompanyWebsiteEqualTo(String value) {
            addCriterion("company_website =", value, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteNotEqualTo(String value) {
            addCriterion("company_website <>", value, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteGreaterThan(String value) {
            addCriterion("company_website >", value, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("company_website >=", value, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteLessThan(String value) {
            addCriterion("company_website <", value, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
            addCriterion("company_website <=", value, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteLike(String value) {
            addCriterion("company_website like", value, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteNotLike(String value) {
            addCriterion("company_website not like", value, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteIn(List<String> values) {
            addCriterion("company_website in", values, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteNotIn(List<String> values) {
            addCriterion("company_website not in", values, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteBetween(String value1, String value2) {
            addCriterion("company_website between", value1, value2, "companyWebsite");
            return this;
        }

        public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
            addCriterion("company_website not between", value1, value2, "companyWebsite");
            return this;
        }

        public Criteria andNumberOfEmployeesIsNull() {
            addCriterion("number_of_employees is null");
            return this;
        }

        public Criteria andNumberOfEmployeesIsNotNull() {
            addCriterion("number_of_employees is not null");
            return this;
        }

        public Criteria andNumberOfEmployeesEqualTo(Short value) {
            addCriterion("number_of_employees =", value, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesNotEqualTo(Short value) {
            addCriterion("number_of_employees <>", value, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesGreaterThan(Short value) {
            addCriterion("number_of_employees >", value, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesGreaterThanOrEqualTo(Short value) {
            addCriterion("number_of_employees >=", value, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesLessThan(Short value) {
            addCriterion("number_of_employees <", value, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesLessThanOrEqualTo(Short value) {
            addCriterion("number_of_employees <=", value, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesIn(List<Short> values) {
            addCriterion("number_of_employees in", values, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesNotIn(List<Short> values) {
            addCriterion("number_of_employees not in", values, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesBetween(Short value1, Short value2) {
            addCriterion("number_of_employees between", value1, value2, "numberOfEmployees");
            return this;
        }

        public Criteria andNumberOfEmployeesNotBetween(Short value1, Short value2) {
            addCriterion("number_of_employees not between", value1, value2, "numberOfEmployees");
            return this;
        }

        public Criteria andCompanyIndustryIsNull() {
            addCriterion("company_industry is null");
            return this;
        }

        public Criteria andCompanyIndustryIsNotNull() {
            addCriterion("company_industry is not null");
            return this;
        }

        public Criteria andCompanyIndustryEqualTo(Short value) {
            addCriterion("company_industry =", value, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryNotEqualTo(Short value) {
            addCriterion("company_industry <>", value, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryGreaterThan(Short value) {
            addCriterion("company_industry >", value, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryGreaterThanOrEqualTo(Short value) {
            addCriterion("company_industry >=", value, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryLessThan(Short value) {
            addCriterion("company_industry <", value, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryLessThanOrEqualTo(Short value) {
            addCriterion("company_industry <=", value, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryIn(List<Short> values) {
            addCriterion("company_industry in", values, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryNotIn(List<Short> values) {
            addCriterion("company_industry not in", values, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryBetween(Short value1, Short value2) {
            addCriterion("company_industry between", value1, value2, "companyIndustry");
            return this;
        }

        public Criteria andCompanyIndustryNotBetween(Short value1, Short value2) {
            addCriterion("company_industry not between", value1, value2, "companyIndustry");
            return this;
        }

        public Criteria andCompanyTypeIsNull() {
            addCriterion("company_type is null");
            return this;
        }

        public Criteria andCompanyTypeIsNotNull() {
            addCriterion("company_type is not null");
            return this;
        }

        public Criteria andCompanyTypeEqualTo(Short value) {
            addCriterion("company_type =", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeNotEqualTo(Short value) {
            addCriterion("company_type <>", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeGreaterThan(Short value) {
            addCriterion("company_type >", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("company_type >=", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeLessThan(Short value) {
            addCriterion("company_type <", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeLessThanOrEqualTo(Short value) {
            addCriterion("company_type <=", value, "companyType");
            return this;
        }

        public Criteria andCompanyTypeIn(List<Short> values) {
            addCriterion("company_type in", values, "companyType");
            return this;
        }

        public Criteria andCompanyTypeNotIn(List<Short> values) {
            addCriterion("company_type not in", values, "companyType");
            return this;
        }

        public Criteria andCompanyTypeBetween(Short value1, Short value2) {
            addCriterion("company_type between", value1, value2, "companyType");
            return this;
        }

        public Criteria andCompanyTypeNotBetween(Short value1, Short value2) {
            addCriterion("company_type not between", value1, value2, "companyType");
            return this;
        }

        public Criteria andSubscribeIsNull() {
            addCriterion("subscribe is null");
            return this;
        }

        public Criteria andSubscribeIsNotNull() {
            addCriterion("subscribe is not null");
            return this;
        }

        public Criteria andSubscribeEqualTo(String value) {
            addCriterion("subscribe =", value, "subscribe");
            return this;
        }

        public Criteria andSubscribeNotEqualTo(String value) {
            addCriterion("subscribe <>", value, "subscribe");
            return this;
        }

        public Criteria andSubscribeGreaterThan(String value) {
            addCriterion("subscribe >", value, "subscribe");
            return this;
        }

        public Criteria andSubscribeGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe >=", value, "subscribe");
            return this;
        }

        public Criteria andSubscribeLessThan(String value) {
            addCriterion("subscribe <", value, "subscribe");
            return this;
        }

        public Criteria andSubscribeLessThanOrEqualTo(String value) {
            addCriterion("subscribe <=", value, "subscribe");
            return this;
        }

        public Criteria andSubscribeLike(String value) {
            addCriterion("subscribe like", value, "subscribe");
            return this;
        }

        public Criteria andSubscribeNotLike(String value) {
            addCriterion("subscribe not like", value, "subscribe");
            return this;
        }

        public Criteria andSubscribeIn(List<String> values) {
            addCriterion("subscribe in", values, "subscribe");
            return this;
        }

        public Criteria andSubscribeNotIn(List<String> values) {
            addCriterion("subscribe not in", values, "subscribe");
            return this;
        }

        public Criteria andSubscribeBetween(String value1, String value2) {
            addCriterion("subscribe between", value1, value2, "subscribe");
            return this;
        }

        public Criteria andSubscribeNotBetween(String value1, String value2) {
            addCriterion("subscribe not between", value1, value2, "subscribe");
            return this;
        }
    }
}
