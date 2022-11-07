package Interface;
class B implements DefaultMethod,DefaultMethod2 {
        @Override
        public void m1() {
            System.out.println("implement m1");
        }

        @Override
        public void m2() {
            DefaultMethod.super.m2();
            DefaultMethod2.super.m2();
        }
    }

