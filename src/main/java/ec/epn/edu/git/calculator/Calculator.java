package ec.epn.edu.git.calculator;

public class Calculator {
    //Clase Calculator Creado por el Grupo 7 - Morán - Pallo
    private int answer;

    public int addition(int a,int b){
        return a+b;
    }

    public int subtraction(int a,int b){
        return a-b;
    }

    public int multiplication(int a,int b){
        return a*b;
    }

    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double division(int a,int b){
        return a/b;
    }

    public void timeout(int time){
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
