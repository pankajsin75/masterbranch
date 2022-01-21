public class Prime_Number{
    public static void main(String[] args) {
    int n1,flag=0;
    Scanner obj= new Scanner(System.in);
    System.out.println("Type in number to check whether it is prime or not");
    n1= obj.nextInt();
     if(n1==0||n1==1)
    System.out.print("Not a prime number");    
    else{
   for(i=2;i<=n1/2;i++){
    if(n1%i==0){
   System.out.println(n1+ " not a prime number");   
   flag=1;
    break;
}   
 }
   if(flag==0)
  System.out.println(n1+ " is a prime number");   
}
}

