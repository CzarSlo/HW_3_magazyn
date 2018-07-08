class Device {
    String code;
    String producent;
    String type;
    double price;

    Device (String code, String producent, String type, double price) {
        this(code, producent, type);
        this.price = price;
    }

    Device (String code, String producent, String type) {
        this.code = code;
        this.producent = producent;
        this.type = type;
        }

    void getInfo () {
        System.out.print("Kod: " + code);
        System.out.print(", producent: " + producent);
        System.out.print(", typ: " + type);
        System.out.print(", cena: " + price);
    }

}
