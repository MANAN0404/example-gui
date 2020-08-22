import java.util.*;
class gradingsystem
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter your number");
int m = scn.nextInt();

if (m>90){
    System.out.print("excellent");
}
else if(80<m && m<=90){
    System.out.print("very good");
}
else if(70<m && m<=80){
    System.out.print("good");
}
else if(60<m && m<=70){
    System.out.print("average");
    }
    else{
        System.out.print("poor");
    }

}


}