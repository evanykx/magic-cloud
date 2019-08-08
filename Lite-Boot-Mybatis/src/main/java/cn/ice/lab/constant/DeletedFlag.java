package cn.ice.lab.constant;

public enum DeletedFlag implements BaseEnum<DeletedFlag, String> {
    YES("YES"), NO("NO");

    private String value;

    private DeletedFlag(String v) {
        this.value = v;
    }

    public String getValue() {
        return this.value;
    }

}
