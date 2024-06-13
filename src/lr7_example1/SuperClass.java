package lr7_example1;

class SuperClass {
    private String text1;

    public SuperClass(String textEx) {
        this.text1 = textEx;
    }

    SuperClass() {
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() +
                "\n" + " text1 = " + this.getText1();
        return superClassNameAndFieldValue;
    }
    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }
}
