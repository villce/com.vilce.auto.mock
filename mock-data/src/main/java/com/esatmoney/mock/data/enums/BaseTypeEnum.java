package com.esatmoney.mock.data.enums;

/**
 * @Description: description
 * @ProjectName: mock-data
 * @Package: com.esatmoney.mock.data.enums
 * @Author: lcz
 * @Date: 2021/7/2 下午3:36
 * @Version: 1.0
 */
public enum BaseTypeEnum {
    /**
     * 基础类型
     */
    String_type("", "String"),
    Integer_type("", "Integer"),
    Double_type("", "Double"),
    Float_type("", "Float"),
    Boolean_type("", "Boolean"),
    Long_type("", "Long"),
    Character_type("", "Character"),
    Byte_type("", "Byte"),
    Short_type("", "Short"),

    int_type("", "int"),
    long_type("", "long"),
    double_type("", "double"),
    float_type("", "float"),
    boolean_type("", "boolean"),

    char_type("", "char"),
    byte_type("", "byte"),
    short_type("", "short"),
    ;

    private String name;
    private String value;

    BaseTypeEnum(String name, String value) {

        this.name = name;
        this.value = value;
    }

    public static BaseTypeEnum getByValue(String value) {
        BaseTypeEnum[] valueList = values();
        for (BaseTypeEnum v : valueList) {
            if (v.getValue().equals(value)) {
                return v;
            }
        }
        return null;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for property <tt>value</tt>.
     *
     * @return property value of value
     */
    public String getValue() {
        return value;
    }
}
