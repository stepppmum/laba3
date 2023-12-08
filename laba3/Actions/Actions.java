package Actions;

public enum Actions {
    LAY, ARGUE, LISTEN, OPEN, RUN, CRY, SEE;
    public Actions setAction(){
        switch(this){
            case CRY:
                return Actions.CRY;
            case LAY:
                return Actions.LAY;
            case RUN:
                return Actions.RUN;
            case SEE:
                return Actions.SEE;
            case OPEN:
                return Actions.OPEN;
            case ARGUE:
                return Actions.ARGUE;
            case LISTEN:
                return Actions.LISTEN;
            default:
                return null;
        }
    }
    public String getAction(){
        switch (this){
            case CRY:
                return " плачет. ";
            case LAY:
                return " лежит на";
            case RUN:
                return " убегает по";
            case SEE:
                return " видит";
            case OPEN:
                return " открывает";
            case ARGUE:
                return " спорит с";
            case LISTEN:
                return " слышит";
            default:
                return null;
        }
    }

}
