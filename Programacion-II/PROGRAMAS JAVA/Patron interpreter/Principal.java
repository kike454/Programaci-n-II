import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    public static void main(String[] args){
        String romano = "LXXI";
        Context context = new Context(romano);

        ArrayList<Expression> tree = new ArrayList<>();
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());

             Iterator<Expression> it = tree.iterator();
            while(it.hasNext()){
                Expression exp = it.next();
                exp.interpret(context);
            }

            System.out.println(context.output);
    }
}
