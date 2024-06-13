package lr7_example1;

class SubClass extends SuperClass {
    private String text2;
    private String text3;

    public SubClass(String textEx2, String textEx3) {
        text2 = textEx2;
        text3 = textEx3;
    }

    public SubClass(String textEx) {
        super(textEx);
    }

    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
            " Class name: " + this.getClass().getSimpleName() + "\n" +
                " text1: " + this.getText1() + "\n" +
                " text2: " + this.text2 + "\n" +
                " text3: " + this.text3;
        return ClassNameAndFieldValue;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }
}

