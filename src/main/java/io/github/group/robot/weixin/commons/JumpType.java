package io.github.group.robot.weixin.commons;

/**
 * 跳转链接类型，
 *
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2022/6/16
 * @since 1.0.0
 */
public enum JumpType {
    /**
     * ，0或不填代表没有点击事件
     */
    NONE(0),
    /**
     * 代表跳转
     */
    URL(1),
    /**
     * 跳转小程序
     */
    MINI_APP(2),
    ;
    private final int value;

    JumpType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
