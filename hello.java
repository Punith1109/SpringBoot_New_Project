class hello {
    public static void main(String args[]) {
        System.out.println("Hey!! Long time no see");
        hello.demo();
        calc c1 = new calc();
        System.out.println(c1.sum(1, 2));
    }

    public static void demo() {
        System.out.println("hdeufchurh");
    }
}

class calc {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
}