package ind.xwm.thermal.enums;

public enum DeliverStatus implements Enumerable<DeliverStatus, Integer> {
    UNDELIVERED(0, "未交付"),
    DELIVERED(1, "已交付");

    private int code;
    private String describe;

    DeliverStatus(int code, String describe) {
        this.code = code;
        this.describe = describe;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    @Override
    public String getDescribe() {
        return this.describe;
    }


    @Override
    public String toString() {
        return "{" + this.code + ":" + this.describe + "}";
    }
}
