public class Practice {
    int num1;
    int num2;
    int num3;
    int num4;
   int result;

    public void subtract(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        result = (num2 - num1);

        System.out.println(result);

    }
        public void  subtract(int num1, int num2, int num3){
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
            result = (num3 - num2 - num1);
            System.out.println(result);
        }
        public void subtract(int num1, int num2, int num3, int num4) {
            this.num1=num1;
            this.num2=num2;
            this.num3=num3;
            this.num4=num4;
            result=(num4-num3-num2-num1);
            System.out.println(result);
    }
    }


