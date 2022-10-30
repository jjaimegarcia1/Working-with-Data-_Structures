public class InClass_9_8Recur1 {
        public static void main(String[] args) {
            int n = 5;
            int fact1 = Factorial1( n );
            System.out.printf("Factorial of N:%s is %s",n, fact1);

            int fact2 = FactorialRecur( n );
            System.out.printf("FactorialRecur of N:%s is %s",n, fact2);
        }

        public static int FactorialRecur(int n) {
            if ( n <= 1) {
                return 1;
            } else {
                return n*FactorialRecur(n - 1);
            }
            //return ret;
        }

        private static int Factorial1(int n) {
            int ret = 1;
            for( int i=n; i > 0; i--){
                ret *= i;
            }
            return ret;
        }

    }

