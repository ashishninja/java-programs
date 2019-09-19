# java-programs
simple programs to practice
class person
{
String s=null;
int age;
char gen;
person(String s,int age,char gen)
{
this.s=s;
this.age=age;
this.gen=gen;
}
void display()
{
System.out.println("\nName:\t "+s);
System.out.println("\nAge:\t "+age);
System.out.println("\nGender:\t "+gen);
}
public static void main(String args[])
{
person p=new person("Ashish",24,m);
p.display();
}
}

