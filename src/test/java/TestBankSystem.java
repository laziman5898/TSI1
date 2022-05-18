import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestBankSystem {

BankSystem bank = new BankSystem(500) ;

@Test
    public void testBankSystem () {
Assertions.assertEquals(500 , bank.getBalance() , "The balance false");
}
}
