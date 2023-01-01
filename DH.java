package algos;

public class DH {



     private  static  long  keyGenerator(long g,long a , long p){

         return( ((long)Math.pow(g,a))%(p));

     }


    public static void main(String[] args) {


        long p = 23L,g = 9L;
        if(args.length == 1)
        {   try {
            Long private_key = Long.parseLong(args[0]);
            System.out.println("The public key is " + keyGenerator(g, private_key, p));
        }

          catch (NumberFormatException e)
          {
              System.err.println("Please provide a valid number for the private key");
              System.exit(1);
          }

        }



      else{

            try {
                Long private_key = Long.parseLong(args[0]);
                Long public_key =  Long.parseLong(args[1]);
                System.out.println("The Session key is " + keyGenerator(public_key, private_key, p));
            }

            catch (NumberFormatException e)
            {
                System.err.println("Please provide a valid number for the private key");
                System.exit(1);
            }



        }


    }

}
