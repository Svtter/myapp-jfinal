package demo;

import com.jfinal.config.*;
import com.jfinal.server.undertow.UndertowServer;
import com.jfinal.template.Engine;


public class DemoConfig extends JFinalConfig {
    public static void main(String[] args) {
        UndertowServer.start(DemoConfig.class);
    }

    public void configConstant(com.jfinal.config.Constants me) {
        me.setDevMode(true);
    }

    public void configRoute(com.jfinal.config.Routes me) {
        me.scan("demo");
    }
    public void configEngine(Engine me) {}
    public void configPlugin(Plugins me) {}
    public void configInterceptor(Interceptors me) {}
    public void configHandler(Handlers me) {}
}
