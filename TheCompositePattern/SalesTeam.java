package TheCompositePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesTeam implements Payee {
    private List<Payee> payees = new ArrayList<>();

    public void addPayees(Payee... newPayees) {
        this.payees.addAll(Arrays.asList(newPayees));
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee payee : payees) {
            payee.payExpenses(amount); 
        }
    }
}
