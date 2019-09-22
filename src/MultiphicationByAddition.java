public class MultiphicationByAddition {
    public static void main(String args[]){
        int a=-10,b=20,i,multiphication=0;
        if(b<0){
            a=a+b;
            b=a-b;
            a=a-b;
        }
        if(a>=0){
            for (i=1;i<=a;i++)
                multiphication+=b;
        }
            if(a<0){
                for (i=a;i<=-1;i++)
                    multiphication-=b;
                }
                System.out.println(+multiphication);
            }

        }

