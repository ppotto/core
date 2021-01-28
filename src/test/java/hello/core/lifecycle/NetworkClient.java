package hello.core.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }


    //서비스 시작시 호출
    public void connect() {
        System.out.println("connect: " + url);
    }

    public void call(String message){
        System.out.println("call: " +url +" message: "+message);
    }


    //서비스 종료시 호출
    public void disconnect(){
        System.out.println("close: "+url );
    }

    //의존 관계 주입이 끝나면 호출하는 메소드
    @PostConstruct //자바에서 제공하는 애노테이션이므로 스프링 컨테이너 외에도 사용가능하다.
    public void init() throws Exception {
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("초기화 연결 메세지");
    }

@PreDestroy
    public void close() throws Exception {
        System.out.println("NetworkClient.destroy");
        disconnect();
    }
}
