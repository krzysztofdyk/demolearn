package mock;


import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;


public class CarTest {
    private Engine mockEngine;
    private Car car;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setup() {
        mockEngine = Mockito.mock(Engine.class);
        car = new Car(mockEngine);
    }

    @Test
    public void addFuel_NotNegative() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Can't add negative fuel");
        car.addFuel(-1);
    }

    @Test
    public void start_NoFuel() throws Exception {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Empty tank!");
        car.start();
    }

    @Test
    public void start() throws Exception {
        car.addFuel(10);
        car.start();

        Mockito.verify(mockEngine).start();
    }
}
