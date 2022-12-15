
public class Main
{
    public static void main(String[] args)
    {
        StringBuffer text = new StringBuffer("Java - an object-oriented programming language \ndeveloped by Sun Microsystems, later acquired by Oracle.\nJava applications are usually compiled into a \nspecial byte-code, so they can run on any Java-virtual \nmachine, regardless of computer architecture.");
        String subA="WordInsert ";
        System.out.println(text);
        int i=0, pos1=0;
        while ((pos1 = text.indexOf("ed ", i)) != -1)
        {
            pos1 += 3;
            text.insert(pos1, subA);
            i = pos1;
        }

        System.out.println("\n\n" + text);
    }
}
