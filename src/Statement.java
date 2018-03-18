public abstract class Statement {
    Statement parent;

    public abstract void mergeToParent();

    public Statement getParent(){return parent;}

}
