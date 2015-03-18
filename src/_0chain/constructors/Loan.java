package _0chain.constructors;

import java.util.Date;

/**
 * Created by twer on 3/18/15.
 */
public class Loan {
    private CapitalStrategy capitalStrategy;
    private final float notional;
    private final float outstanding;
    private final int rating;
    private final Date expiry;
    private Date maturity;

    public Loan(float notional, float outstanding, int rating, Date expiry) {
        this.capitalStrategy = new TermROC();
        this.notional = notional;
        this.outstanding = outstanding;
        this.rating = rating;
        this.expiry = expiry;
    }

    public Loan(float notional, float outstanding, int rating, Date expiry, Date maturity) {
        this.capitalStrategy = new RevolvingTermROC();
        this.notional = notional;
        this.outstanding = outstanding;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = maturity;
    }

    public Loan(CapitalStrategy strategy, float notional, float outstanding, int rating, Date expiry, Date maturity) {
        this.capitalStrategy = strategy;
        this.notional = notional;
        this.outstanding = outstanding;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = maturity;
    }

}
