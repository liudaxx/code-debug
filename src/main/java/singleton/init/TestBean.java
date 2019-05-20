package singleton.init;

import org.springframework.aop.AopInterface;

public class TestBean implements AopInterface {

    private TestBean testBean;

    public TestBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestBean testBean) {
        this.testBean = testBean;
    }

    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public void doSomething() {
        System.out.println("do");
    }
}
