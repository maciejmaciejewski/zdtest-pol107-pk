package pl.sda.steps;

import io.cucumber.java.en.Given;
import pl.sda.TestContext;

public class Example extends BaseStep {
    public Example(TestContext context) {
        super(context);
    }

    @Given("I have an example")
    public void i_have_an_example() {
        System.out.println("Hello from example");
        driver.get(context.FRONTEND_URL);
    }
}
