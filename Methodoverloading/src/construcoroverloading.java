public class construcoroverloading {

    private String message;

    public void Tester(){
        message = "Hello World!";
    }
    public void Tester(String message){
        this.message = message;
    }

    public String getMessage(){
        return message ;
    }

    public void setMessage(String message){
        this.message = message;
    }}