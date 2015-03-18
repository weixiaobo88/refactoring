package chain.constructors;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

public class LoanTest {
    float notional;
    float outstanding;
    int rate;
    Date expiry;

    @Before
    public void setUp() throws Exception {
        notional = 1;
        outstanding = 2;
        rate = 3;
        expiry = new Date();
    }

    @Test
    public void should_use_constructor_with_termROC_strategy() {
        assertNotNull(new Loan(notional, outstanding, rate, expiry));
    }

    @Test
    public void should_use_constructor_with_RevolvingTermROC_strategy() {
        Date maturity = new Date();

        assertNotNull(new Loan(notional, outstanding, rate, expiry, maturity));
    }

    @Test
    public void should_use_constructor_with_CapitalStrategy() {
        Roc roc = new Roc();
        Date maturity = new Date();

        assertNotNull(new Loan(roc, notional, outstanding, rate, expiry, maturity));
    }
}