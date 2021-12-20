import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCalcul {
    Calcul calcul;
    CalculService service;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {

    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        service = mock(CalculService.class);
        calcul = new Calcul(service);

    }

    @AfterEach
    void tearDown() throws Exception {
    }


    @Test
    public void testFct(){
        Calcul a = new Calcul();
        assertEquals(1,a.calculNote(1,1));
    }

    @Test
    public void testmock(){
        when(service.method(3,4)).thenReturn(7);
        assertEquals(7,service.method(3,4));
    }






}
