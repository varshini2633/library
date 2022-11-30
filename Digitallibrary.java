import java.util.*;
import java.util.Dictionary;
import java.util.Hashtable;
import javax.swing.JOptionPane; 
public class Digitallibrary
{
    public static void main(String [] args)
    {
        String opt =JOptionPane.showInputDialog("Are you librarian(if yes enter 1):)");
        int you=Integer.valueOf(opt);
        if(you==1 )
        {
        Library ob=new Library();
        int exit=0;
        while(exit ==0)
        {
            JOptionPane.showMessageDialog(null,"press 1 to add book\npress 2 to issue a book\npress 3 to return a book\npress 4 to print complete issue daatails\npress 5 to exit");
        String choice=JOptionPane.showInputDialog("Enter your choice:");
        int ch=Integer.valueOf(choice);
        switch(ch)
        {
            case 1:
                ob.add();
                break;
            case 2:
                ob.issue();
                break;
            case 3:
                ob.ret();
                break;
            case 4:
                ob.details();
                break;
            case 5:
                exit=1;
                break;
            default:
            JOptionPane.showMessageDialog(null,"Wrong option entered");
        }
    }
}
else
{
    user ob1=new user();
    ob1.read();
}
    }
}
class Library
{
    String name,name1,issuedate,retdate,stuname;
    int prize,bookno,bookno1,num,bookid;
    Scanner sc = new Scanner(System.in); 
    void add()
    {
        name =JOptionPane.showInputDialog("Enter book name");
        String bookp =JOptionPane.showInputDialog("Enter book prize");
        prize=Integer.valueOf(bookp);
        String bookno1 =JOptionPane.showInputDialog("Enter Book number");
        bookno=Integer.valueOf(bookno1);
        JOptionPane.showMessageDialog(null,"Your details is"+"\nName: "+name +"\n Prize: "+prize+"\n Book Number: "+bookno);
    }
    void issue()
    {
        name1=JOptionPane.showInputDialog("Book Name:");
        String booknum=JOptionPane.showInputDialog("Book ID:");
        bookno1=Integer.valueOf(booknum);
        issuedate=JOptionPane.showInputDialog("Issue date:");
        String num1=JOptionPane.showInputDialog("Total number of books Issued");
        num=Integer.valueOf(num1);
        retdate=JOptionPane.showInputDialog("Return Date:");
    }
    void ret()
    {
        stuname=JOptionPane.showInputDialog("Enter studnt name:");
        String id=JOptionPane.showInputDialog("Enter book num");
        bookid=Integer.valueOf(id);
        if(bookno1 == bookno)
        {
            JOptionPane.showMessageDialog(null,"Total Details:\nBook name: "+name1+"\nBook no: "+bookno1+"\nIssue date:"+issuedate+"\nTotal number of books Issued: "+num +"\nBook Return on: "+retdate);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Wrong Id ,please enter correct id");
        }
    }
    void details()
    {
        JOptionPane.showMessageDialog(null,"Total Details:\nBook name: "+name1+"\nBook no: "+bookno1+"\nIssue date:"+issuedate+"\nTotal number of books Issued: "+num+"\nBook Return on: "+retdate);
    }
}
class user
{
    int read;
    Scanner sc=new Scanner(System.in);
    void read()
    {
        Dictionary dictio = new Hashtable(10);
        dictio.put("1", "War and peace");
        dictio.put("2", "Tom and Jerry");
        dictio.put("3", "Harry potter");
        dictio.put("4", "The adventures of Huvkleberry Finn");
        dictio.put("5", "The stories of Anton checkhov");
        dictio.put("6", "In Search of Lost time");
        dictio.put("7", "Great Expectations");
        dictio.put("8", "Crime and punishment");
        dictio.put("9", "To the light house");
        dictio.put("10", "The divine comedy");
        JOptionPane.showMessageDialog(null,dictio.elements());
        String r=JOptionPane.showInputDialog("Enter the book id that you want to read");
        read=Integer.valueOf(r);
        JOptionPane.showMessageDialog(null,"now you can read the BOOk");
    }
}