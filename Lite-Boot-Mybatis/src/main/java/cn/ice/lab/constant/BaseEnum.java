package cn.ice.lab.constant;

public interface BaseEnum<E extends Enum<?>, T> {
    T getValue();
}
