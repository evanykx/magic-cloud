package cn.ice.lab.constant;

public enum DeletedFlag {
    YES("YES"), NO("NO");

    private String value;

    DeletedFlag(String v) {
        this.value = v;
    }

    public String getValue() {
        return this.value;
    }

}
