public static void main(String[] args) {
        int r=sumN(123,0);
        System.out.println(r);
    }

    static int sumN(int n,int sum)
    {
        if(n<=0)
        {
            return sum;
        }

        sum=sum+(n%10);

        return sum+sumN(n/10,sum);
    }
