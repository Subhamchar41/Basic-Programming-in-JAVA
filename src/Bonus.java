public class Bonus {
    public static void main(String args[]){
        float salary=5000,bonus=0;
        char gender='M';

        if(gender=='M' || gender=='m'){
            if(salary<10000){
            bonus= (float) (salary*0.05);
        }else {
            bonus= (float) (salary*0.02);
        }
            if(gender=='F' || gender=='f'){
                if (salary<10000)
            bonus= (float) (salary*0.10);
        }else
            bonus= (float) (salary*0.02);
        }
        salary+=bonus;
        System.out.println(+bonus);
        System.out.println(+salary);
    }
}
