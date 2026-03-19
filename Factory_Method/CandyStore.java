package Factory_Method;

public class CandyStore {
	private CandyFactory factory;

    public CandyStore(CandyFactory factory) {
        this.factory = factory;
    }

    public Candy orderCandy(String type) {
        
        Candy candy = factory.getCandy(type);
        
        if (candy != null) {
            candy.prepare();
            candy.packageCandy();
        } else {
            System.out.println("Xin loi, chung toi khong co loai keo nay!");
        }
        return candy;
    }
}



