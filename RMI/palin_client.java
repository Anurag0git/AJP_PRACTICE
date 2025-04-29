import java.rmi.*;

public class palin_client {

public static void main(String args[])

{

String value="MADAM";

boolean answer;

try

{

// lookup method to find reference of remote object

string_palindrome access =

(string_palindrome)Naming.lookup("rmi://localhost:5600"+"/PALINDROME");

answer = access.palin(value);

if (answer)

System.out.println("String is PALINDROME!!!");

else

System.out.println("String is NOT PALINDROME!");

}

catch(Exception ae)

{

System.out.println(ae);

}

}
}
