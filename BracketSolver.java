import java.util.Scanner;
public class BracketSolver{
    public static void main(String[] args){
        String str = "";
        if(args.length>0){
            str = args[0];
        }else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a bracket string");
            str = sc.next();
        }
        Stack stack = new Stack();
        for(int i=0;i<str.length();i++){
            Bracket br = new Bracket(str.charAt(i));
            if(br.getBracketType() == BracketType.OPEN){
                if(!stack.push(br)){
                    System.out.println("Stack is full");
                    return;
                }
            }
            else if(br.getBracketType() == BracketType.CLOSE){
                Bracket topElement = stack.topElement();
                if(topElement!= null){
                    if(br.isComplementBracketOf(topElement)){
                        if(stack.pop() == null){
                            System.out.println("Extra closing bracket at "+i);
                            return;
                        }
                    }else{
                        System.out.println("Unmatched brackets found at "+i);
                        return;
                    }
                }else{
                    System.out.println("Stack is unexpectedly empty"+i);
                    return;
                }
                
            }else{
                System.out.println("Other than bracket char is also present");
            }
        }
        if(stack.isStackEmpty()){
            System.out.println("Brackets are proper in order");
        }else{
            System.out.println("Missed closing bracket");
        }
    }
}


class Bracket{
    private char ch;
    private BracketType bt;

    public String toString(){
        return String.valueOf(ch);
    }

    public char value(){
        return ch;
    }
    public Bracket(char ch){
        this.ch = ch;
        this.bt = getBracketType();
    }

    public boolean isComplementBracketOf(char ch){
        return this.ch == getComplementBracket(ch);
    }

    public boolean isComplementBracketOf(Bracket ch){
        return this.ch == getComplementBracket(ch.value());
    }

    public static char getComplementBracket(char ch){
        switch(ch){
            case '(': return ')';
            case '{': return '}';
            case '[': return ']';

        }
        return ' ';
    }

    public BracketType getBracketType(){
        if(ch == '('  ||  ch == '['  || ch == '{'){
            return BracketType.OPEN;
        }

        if(ch == ')' || ch == ']' || ch == '}'){
            return BracketType.CLOSE;
        }

        return BracketType.NONE;
    }

}



enum BracketType{
    OPEN,
    CLOSE,
    NONE
}

class Stack{
    final private int SIZE = 10;
    private Bracket[] arr;
    private int top;



    public Stack(){
        this.arr = new Bracket[SIZE];
        this.top = -1;
    }

    public Bracket topElement(){
        if(!isStackEmpty()){
            return this.arr[top];
        }
        return null;
    }



    public Bracket pop(){
        if(!isStackEmpty()){
            return this.arr[top--];
        }
        return null;
    }

    public boolean push(Bracket ch){
        if(!isStackFull()){
            this.top ++;
            this.arr[this.top] = new Bracket(ch.value());
            return true;
        }else{
            return false;
        }
    }

    public boolean isStackFull(){
        return (this.top == this.SIZE-1);
    }

    public boolean isStackEmpty(){
        return this.top == -1;
    }
}