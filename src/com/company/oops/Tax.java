package oops;

public class Tax {
    public static int taxCalculator(int salary, int saving) {
        int taxableIncome = salary - saving ;
        int tax = 0;
        if (saving > 100000) {
            taxableIncome = salary - 100000;
        } else if (saving > 0 && saving <= 100000) {
            taxableIncome = salary - saving;
        }
        if (taxableIncome > 0 && taxableIncome <= 100000) {
            tax = 0;
        } else if (taxableIncome > 100000 && taxableIncome <= 200000) {
            tax = (int)(0.1 * (taxableIncome - 100000));
        } else if (taxableIncome > 200000 && taxableIncome <= 500000) {
            tax = (int)((0.1 * 100000) + (taxableIncome - 200000) * 0.2); 
        } else if (taxableIncome > 500000) {
            tax = (int)((0.1 * 100000) + (0.2 * 300000) + ((taxableIncome - 500000) * 0.3));
        }
        return tax;
    }


    public static void main(String[] args) {
        int salary = 200000;
        int saving = 50000;

        System.out.println(taxCalculator(salary,saving));
    }
}
