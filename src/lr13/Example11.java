package lr13;

public class Example11 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("������ ������� �������");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("�������� �����");
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }

}
