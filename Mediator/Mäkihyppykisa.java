public class Mäkihyppykisa {
    public static void main(String[] args) {
    Mediator välittäjä = new HiihtohyppyKilpailuMediator();
    Hyppääjä hyppääjä1 = new Hyppääjä("Matti", välittäjä);
    Hyppääjä hyppääjä2 = new Hyppääjä("Kalle", välittäjä);
    
    
        hyppääjä1.suoritaHyppy(1, 120, new double[]{18, 19, 19.5, 18.5, 19});
        hyppääjä1.suoritaHyppy(2, 125, new double[]{18.5, 19, 19, 19.5, 18});
    
        hyppääjä2.suoritaHyppy(1, 115, new double[]{17.5, 18, 18.5, 17, 18});
        hyppääjä2.suoritaHyppy(2, 130, new double[]{19, 19.5, 18, 18.5, 19});
    }
    
}