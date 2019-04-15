 System.out.println ("Input 1= " +a);
         System.out.println ("Input 2= " +b);
         System.out.println ("Input 3= " +c);

         // if and else statement

        if (a<b) {
                if (b<c)
                System.out.println("The order is: "+a+" "+b+" "+c);
                    else
                    System.out.println("The order is: "+a+" "+c+" "+b);

        }
        else if (b<a){
                if (a<c)
                System.out.println("The order is: "+b+" "+a+" "+c );
                    else
                    System.out.println("The order is: "+b+" "+c+" "+a  );
        }

        else if (c<a){
                if (b<a)
                System.out.println("The order is: "+c+" "+a+" "+b);
                    else
                    System.out.println("The order is: "+c+" "+b+" "+a);

        }


    }
}