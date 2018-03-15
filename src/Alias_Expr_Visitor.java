import org.antlr.v4.runtime.misc.Pair;

public class Alias_Expr_Visitor extends bigqueryBaseVisitor<Pair<String,String>>{
    @Override
    public Pair<String, String> visitAlias_expr(bigqueryParser.Alias_exprContext ctx){
        return new Pair<String, String>(ctx.expr().getText(), ctx.alias_name() == null ? "" : ctx.alias_name().getText());
    }
}
