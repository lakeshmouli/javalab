class Parents
{
public void showcase ( )
{
System.out.println(" I am Parent");
}
}
class children extends Parents
{
public void showcase ( )
{
System.out.println(" I am children");
}
}
public class Runtime
{
public static void main(String args[ ])
{
Parents p = new Parents( );
p.showcase( );
Parents pp = new children( );
pp.showcase( );
children c = new children( );
c.showcase( );
}
}
