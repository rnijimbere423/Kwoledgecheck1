import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(1, "Richard Nijimbere","Deposing", "500000","0.2"));
        accList.add(new Account(2, "Clovis NZIRAGUHINDWA","Credit", "250000", "0.19"));
        accList.add(new Account(3, "Darcy NZOYIHAYA","Checking","550000","0.11"));
        accList.add(new Account(4, "Arstide MAYIRA Desire","Saving", "180000", "0.25"));
        accList.add(new Account(5, "Deogratias NSHIMIRIMANA","Checking", "850000","0.3"));
        accList.add(new Account(6, "Gilbert NDAYISHIMIYE","Deposit","690000","0.4"));
        accList.add(new Account(7, "Godefroid ","Credit", "4900000",  "0.5"));
        accList.add(new Account(8, "Mukeshantore desire","Debit", "2586000",   "0.6"));
        accList.add(new Account(9, "Emerry Nimbona","Saving", "3330000", "0.9"));
        accList.add(new Account(10, "MUTONI aline","Checking","8210000","0.17"));



        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}
