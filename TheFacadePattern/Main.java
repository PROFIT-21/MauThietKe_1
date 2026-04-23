package TheFacadePattern;

public class Main {
    public static void main(String[] args) {

        VacationFacade vacationAgent = new VacationFacade();
        
        vacationAgent.bookFullVacation("Paris");
    }
}
