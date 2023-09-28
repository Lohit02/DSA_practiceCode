class Sh1 {
    private void m1()
    {
        System.out.println("From parent m1()");
    }

    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}

class Child extends Sh1 {
    private void m1()
    {
        System.out.println("From child m1()");
    }
    @Override public void m2()
    {
        System.out.println("From child m2()");
    }
}