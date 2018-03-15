package ind.xwm.thermal.enums;

public enum PrintStatus implements Enumerable<PrintStatus, Integer> {
    UNPRINTED(0, "未打印"),
    PRINTED(1, "已打印")
    ;

    private int code;
    private String describe;

    PrintStatus(int code, String describe) {
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
