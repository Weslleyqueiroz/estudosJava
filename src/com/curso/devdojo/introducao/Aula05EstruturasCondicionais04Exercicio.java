package com.curso.devdojo.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        //Band 1 (up to €38,441): 35.82% (reduced from 36.97% in 2024).
        //Band 2 (€38,441 - €76,817): 37.48% (new intermediate bracket).
        //Band 3 (over €76,817): 49.50% (unchanged).
        double salary = 39000;

        if (salary <= 38441 ){
           double salaryTax = salary * 35.82/100;
            System.out.println("my taxes salary is: " + salaryTax);
            double newSalary = salary - salaryTax;
            System.out.println("My new salary is : " + newSalary);

        } else if (salary > 38441 && salary <= 76817) {
            double salaryTax = salary * 37.84/100;
            System.out.println("my taxes salary is: " + salaryTax);
            double newSalary = salary - salaryTax;
            System.out.println("My new salary is : " + newSalary);
        }else {
            double salaryTax = salary * 49.50/100;
            System.out.println("my taxes salary is: " + salaryTax);
            double newSalary = salary - salaryTax;
            System.out.println("My new salary is : " + newSalary);
        }


    }
}
