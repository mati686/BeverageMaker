public enum CupSize {
    BIG("big"), SMALL("small");

    private String size;

    CupSize(String size) {
        this.size = size;
    }

    String getCupSize() {
        return size;
    }
}
