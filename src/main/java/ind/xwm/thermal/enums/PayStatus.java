package ind.xwm.thermal.enums;

public enum PayStatus implements Enumerable<PayStatus, Integer> {
    UNPAYED(0, "未支付"),
    PAYED(1, "已支付")
    ;
    private int code;
    private String describe;

    PayStatus(int code, String describe) {
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
