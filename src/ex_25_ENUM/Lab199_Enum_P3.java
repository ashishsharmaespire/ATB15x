package ex_25_ENUM;

public class Lab199_Enum_P3 {
    public static void main(String[] args) {
        System.out.println(HEX_code.RED.getHexCode());
        System.out.println(HEX_code.Green.getHexCode());
        System.out.println(HEX_code.blue.getHexCode());
    }
}

enum HEX_code {

    RED("#12121"),
    Green("#1212444"),
    blue("#0999");

    private String hexCode;

    HEX_code(String hexCode) {
        this.hexCode = hexCode;
    }

     String getHexCode() {
        return this.hexCode;   // ✅ variable return — not method call
    }
}
