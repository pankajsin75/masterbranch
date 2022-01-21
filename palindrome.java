class palindrome{
public static void main(String[] args) {
  
String Original="NitiN", Reverse="";
int length= Original.length();
for(int i=length-1;i>=0;i--)
Reverse = Reverse + Original.charAt(i);
 System.out.println("Reverse String is " + Reverse);

if(Original.equals(Reverse))
System.out.println("It is palindrome String");
else
System.out.println("Not a palindrome");
}
}