// New Features of Groovy



//Anonymous Inner Classes and Nested Classes

class A {
    static class B {
    }
}

println "new A.B();"
println new A.B();


boolean called = false;

Timer timer = new Timer();

timer.schedule(new TimerTask() {
    void run() {
        called = true;
    }
}, 100)


sleep 1000

assert called
        



