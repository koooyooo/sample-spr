package hello;


public class MessageServiceImpl implements MessageService {

    public void init() {
        System.out.println("init");
    }

    public String getMessage() {
        return "Hello Wow";
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
